package section4_02_아나그램;
import java.util.*;


public class Main {
	public String solution(String s1, String s2) {
		String answer = "YES";
		Map<Character, Integer> map = new HashMap<>();
		for (char x: s1.toCharArray()) {
			map.put(x, map.getOrDefault(x, 0)+1);
		}
		for (char x: s2.toCharArray()) {
			if (!map.containsKey(x) || map.get(x) == 0) return "NO";
			map.put(x, map.get(x) - 1);
		}
		
		return answer;
	}
	
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		String s1 = scan.next();
		String s2 = scan.next();
		System.out.println(T.solution(s1, s2));
	}

}
