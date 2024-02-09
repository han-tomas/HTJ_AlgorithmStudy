package section1_11_문자열압축;
import java.util.*;


public class Main {
	public String solution(String s) {
		String answer = "";
		s += " ";
		int count = 1;
		for (int i = 0; i < s.length() - 1; i++) {
			if(s.charAt(i) == s.charAt(i + 1)) count ++;
			else {
				answer += s.charAt(i);
				if(count != 1) answer += count;
				count = 1;
			}
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
