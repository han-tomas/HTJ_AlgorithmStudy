package section8_07_조합수_메모이제이션;
import java.util.*;


public class Main {	
	int[][] ch = new int[35][35];
	public int DFS(int n, int r) {
		if (ch[n][r] > 0) return ch[n][r];
		if (n == r || r == 0) {
			return 1;
		}
		else return ch[n][r] = DFS(n-1, r-1) + DFS(n-1, r);
	}
	
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int r = scan.nextInt();
		System.out.println(T.DFS(n , r));
	}

}
