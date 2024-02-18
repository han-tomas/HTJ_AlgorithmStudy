package section5_02_괄호문자제거;
import java.util.*;


public class Main {
	public String solution(String s) {
		String answer = "";
		Stack<Character> stack = new Stack<>();
		for (char x: s.toCharArray()) {
			if (x ==')') {
				while (stack.pop() != '(');
			}
			else stack.push(x);
		}
		for(char x: stack) {
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
