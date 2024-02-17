package section3_05_연속된자연수의합;
import java.util.*;


public class Main {
	public int solution(int n) {
		int answer = 0;
		int m = n/2 + 1;
		int sum = 0;
		int lt = 1;
		for (int rt = 1; rt <= m; rt ++) {
			sum += rt;
			while (sum > n && lt < rt) {
				sum -= lt++;
			}
			if (sum == n) answer ++;
		}
		return answer;
	}
	
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println(T.solution(n));
	}
}
