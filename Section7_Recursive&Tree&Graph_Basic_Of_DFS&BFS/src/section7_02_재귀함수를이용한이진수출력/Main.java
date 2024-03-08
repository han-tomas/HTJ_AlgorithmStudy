package section7_02_재귀함수를이용한이진수출력;
import java.util.*;


public class Main {
	public void solution (int n) {
		if (n == 0) {
			return;
		}
		else {
			solution(n / 2);
			System.out.print(n % 2);
		}
	}
	
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		T.solution(n);
	}
}
