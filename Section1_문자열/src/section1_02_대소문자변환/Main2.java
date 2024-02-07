package section1_02_대소문자변환;
import java.util.*;


public class Main2 {
	public String solution(String s) {
		String answer ="";
		for (char x: s.toCharArray()) {
			if(x >= 97 && x <= 122) answer += (char)(x - 32);
			else answer += (char)(x + 32);
		}
		return answer;
	}
	
	
	public static void main(String[] args) {
		Main2 T = new Main2();
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		System.out.println(T.solution(s));
	}

}
