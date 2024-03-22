package section8_04_중복순열구하기;
import java.util.*;


public class Main {
	static int n, m;
	static int[] pm;
	
	
	public void DFS(int L) {
		if(L == m) {
			for (int i = 0; i < m; i++) {
				System.out.print(pm[i] + " ");
			}
			System.out.println();
		}
		else {
			for (int i = 1;  i <= n; i++) {
				pm[L] = i;
				DFS(L + 1);
			}
		}
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		m = scan.nextInt();
		pm = new int[m];
		T.DFS(0);
	}

}
