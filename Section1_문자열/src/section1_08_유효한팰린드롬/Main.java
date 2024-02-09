package section1_08_유효한팰린드롬;
import java.util.*;


public class Main {
	public String solution(String s) {
		s = s.toUpperCase().replaceAll("[^A-Z]", "");
		StringBuffer sb = new StringBuffer(s);
		String s2 = sb.reverse().toString();
		if (!s.equals(s2)) return "NO";
		return "YES";
	}
	
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		System.out.println(T.solution(s));
	}

}
