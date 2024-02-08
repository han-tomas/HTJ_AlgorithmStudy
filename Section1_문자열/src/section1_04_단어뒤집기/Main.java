package section1_04_단어뒤집기;
import java.util.*;


public class Main {
	public String solution(String s) {
		String answer ="";
		char[] c = s.toCharArray();
		int lt = 0;
		int rt = s.length() - 1;
		while (lt < rt) {
			char temp = c[lt];
			c[lt] = c[rt];
			c[rt] = temp;
			lt ++;
			rt --;
		}
		for (char x : c) {
			answer += x;
		}
		return answer;
	}
	
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			String s = scan.next();
			System.out.println(T.solution(s));
		}
	}

}
