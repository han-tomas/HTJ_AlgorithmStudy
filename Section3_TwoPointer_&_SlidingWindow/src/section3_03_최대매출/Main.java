package section3_03_최대매출;
import java.util.*;


public class Main {
	public int solution(int n, int k, int[] arr) {
		int max = Integer.MIN_VALUE;
		int sum = 0;
		for (int i = 0; i < k; i++) {
			sum += arr[i];
		}
		max = Math.max(max, sum);
		for (int i = k; i < n; i++) {
			sum += (arr[i] - arr[i-k]);
			max = Math.max(max, sum);
		}
		return max;
	}
	
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i <  n; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println(T.solution(n, k, arr));
	}

}
