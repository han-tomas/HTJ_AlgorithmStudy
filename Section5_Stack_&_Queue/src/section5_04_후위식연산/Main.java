package section5_04_후위식연산;
import java.util.*;


public class Main {
	public int solution(String s) {
		
		Stack<Integer> stack = new Stack<>();
		for (char x: s.toCharArray()) {
			if (Character.isDigit(x)) {
				int n = (int)x - 48;
				stack.push(n);
			}
			else {
				int rt = stack.pop();
				int lt = stack.pop();
				if (x == '+') stack.push(lt + rt);
				else if (x == '-') stack.push(lt - rt);
				else if (x =='*') stack.push(lt * rt);
				else stack.push(lt/rt);
			}
		}
		return stack.pop();
	}
	
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		System.out.println(T.solution(s));
	}

}
