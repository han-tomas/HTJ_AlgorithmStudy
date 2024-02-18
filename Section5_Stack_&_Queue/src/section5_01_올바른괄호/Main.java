package section5_01_올바른괄호;
import java.util.*;


public class Main {
	public String solution(String s) {
		String answer = "YES";
		Stack<Character> stack = new Stack<>();
		for (char x: s.toCharArray()) {
			if (x == '(') stack.push(x);
			else {
				if(stack.isEmpty()) return "NO";
				else stack.pop();
			}
		}
		if (!stack.isEmpty()) return "NO";
		return answer;
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		System.out.println(T.solution(s));
	}

}
