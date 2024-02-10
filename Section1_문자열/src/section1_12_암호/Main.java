package section1_12_암호;
import java.util.*;


public class Main {
	public String solution(int n,String s) {
		String answer = "";
		s = s.replace("#", "1").replace("*", "0");
		for(int i = 0; i < n; i++) {
			String temp = s.substring(0, 7);
			char c = (char)(Integer.parseInt(temp,2));
			answer += c;
			s = s.substring(7);
		}
		return answer;
	}
	
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String s = scan.next();
		System.out.println(T.solution(n, s));
	}

}
