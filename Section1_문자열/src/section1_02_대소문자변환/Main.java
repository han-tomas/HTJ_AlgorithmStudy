package section1_02_대소문자변환;
import java.util.*;


public class Main {
	public String solution(String s) {
		String answer = "";
		for(char x: s.toCharArray()) {
			if(Character.isUpperCase(x)) answer += Character.toLowerCase(x);
			else answer += Character.toUpperCase(x);
		}
		return answer;
	}
	
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		System.out.println(T.solution(s));
	}

}
