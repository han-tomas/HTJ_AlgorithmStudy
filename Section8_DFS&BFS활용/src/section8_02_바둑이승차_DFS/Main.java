package section8_02_바둑이승차_DFS;
import java.util.*;


public class Main {
	static int c, n, max = Integer.MIN_VALUE;
	
	public void DFS(int L, int sum, int[] arr) {
		if (sum > c) return;
		if (L == n) {
			if(sum <= c) {
				max = Math.max(sum, max);
			}
		}
		else {
			DFS(L+1, sum+arr[L], arr);
			DFS(L+1, sum, arr);
		}
	}
	
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		c = scan.nextInt();
		n = scan.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		T.DFS(0, 0, arr);
		System.out.println(max);
	}

}
