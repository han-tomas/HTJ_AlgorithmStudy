package section1_07_회문문자열;
import java.util.*;


public class Main {
	public String solution(String s) {
		s = s.toUpperCase();
		char[] c = s.toCharArray();
		int lt = 0;
		int rt = s.length() - 1;
		while (lt < rt) {
			if(c[lt] != c[rt]) return "NO";
			lt ++;
			rt --;
		}
		return "YES";
	}
	
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		System.out.println(T.solution(s));
	}

}
