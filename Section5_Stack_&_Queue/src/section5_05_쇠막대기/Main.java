package section5_05_쇠막대기;
import java.util.*;


public class Main {
	public int solution (String s) {
		int answer = 0;
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == '(') stack.push(s.charAt(i));
			else {
				stack.pop();
				if(s.charAt(i - 1) == '(') answer += stack.size();
				else answer ++;
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
