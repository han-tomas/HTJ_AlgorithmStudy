package section8_06_순열구하기;
import java.util.*;


public class Main {
	static int n, m;
	static int[] ch, pm, arr;
	
	
	public void DFS(int L) {
		if(L == m) {
			for (int i = 0 ; i < m; i++) {
				System.out.print(pm[i] + " ");
			}
			System.out.println();
		}
		else {
			for (int i = 0; i < n; i++) {
				if (ch[i] == 0) {
					ch[i] = 1;
					pm[L] = arr[i];					
					DFS(L+1);
					ch[i] = 0;
				}
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		m = scan.nextInt();
		arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		ch = new int[n];
		pm = new int[m];
		T.DFS(0);
	}

}
