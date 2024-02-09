package section1_07_회문문자열;
import java.util.*;


public class Main2 {
	public String solution(String s) {
		s = s.toUpperCase();
		StringBuffer sb = new StringBuffer(s);
		String s2 = sb.reverse().toString();
		if(!s.equals(s2)) return "NO";
		return "YES";
	}
	public static void main(String[] args) {
		Main2 T = new Main2();
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		System.out.println(T.solution(s));
	}

}
