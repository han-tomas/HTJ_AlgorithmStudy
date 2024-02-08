package section1_05_특정문자뒤집기;
import java.util.*;


public class Main {
	public String solution(String s) {
		String answer = "";
		int lt = 0;
		int rt = s.length() - 1;
		char[] c = s.toCharArray();
		while (lt < rt) {
			if(Character.isAlphabetic(c[lt]) && Character.isAlphabetic(c[rt])) {
				char temp = c[lt];
				c[lt] = c[rt];
				c[rt] = temp;
				lt ++;
				rt --;
			}
			else {
				lt ++;
				rt --;
			}
		}
		for(char x: c) {
			answer += x;
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
