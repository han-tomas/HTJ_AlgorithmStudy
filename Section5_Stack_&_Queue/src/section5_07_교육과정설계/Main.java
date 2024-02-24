package section5_07_교육과정설계;
import java.util.*;


public class Main {
	public String solution(String s1, String s2) {
		Queue<Character> q = new LinkedList<>();
		for (char c: s1.toCharArray()) {
			q.add(c);
		}
		for (char c: s2.toCharArray()) {
			if(q.peek() == c) q.poll();
			if(q.isEmpty()) return "YES";
		}
		
		return "NO";
	}
	
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		String s1 = scan.next();
		String s2 = scan.next();
		System.out.println(T.solution(s1, s2));
	}

}
