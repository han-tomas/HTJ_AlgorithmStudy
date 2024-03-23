package section8_05_동전교환;
import java.util.*;


public class Main {
	static int n, m, answer = Integer.MAX_VALUE;
	
	public void DFS(int L, int sum, Integer[] coins) {
		if (sum > m) return;
		if (L >= answer) return;
		if (sum == m) {
			answer = Math.min(L, answer);
		}
		else {
			for (int i = 0; i < n; i++) {				
				DFS(L+1, sum + coins[i], coins);
			}
		}
	}
	
	
	public static void main(String[] args) {
		Main T= new Main();
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		Integer[] coins = new Integer[n];
		for (int i = 0; i < n; i++) {
			coins[i] = scan.nextInt();
		}
		Arrays.sort(coins, Collections.reverseOrder());
		m = scan.nextInt();
		T.DFS(0, 0, coins);
		System.out.println(answer);
	}

}
