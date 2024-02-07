package section1_01_문자찾기;
import java.util.*;


public class Main {
	public int solution(String s, char c) {
		int answer = 0;
		s = s.toUpperCase();
		c = Character.toUpperCase(c);
		for(char x: s.toCharArray()) {
			if (x == c) answer ++;
		}
		return answer;
	}
	
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		char c = scan.next().charAt(0);
		System.out.println(T.solution(s, c));
	}

}
