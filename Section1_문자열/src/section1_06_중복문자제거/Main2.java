package section1_06_중복문자제거;
import java.util.*;


public class Main2 {
	public String solution(String s) {
		String answer = "";
		for (int i = 0; i < s.length(); i++) {
			if(s.indexOf(s.charAt(i)) == i) answer += s.charAt(i);
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
