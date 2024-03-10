package section7_04_피보나치수열;
import java.util.*;


public class Main {
	public int solution(int n) {
		if (n == 1) return 1;
		else if (n == 2) return 1;
		else return solution(n - 1) + solution(n - 2);
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.print(T.solution(i) + " ");
		}
	}

}
