package section7_01_재귀함수;
import java.util.*;


public class Main {
	public void solution (int n) {
		if (n == 0) return;
		else {
			solution(n - 1);
			System.out.print(n + " ");
		}
	}
	
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		T.solution(n);
	}

}
