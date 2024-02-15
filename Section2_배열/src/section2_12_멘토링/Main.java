package section2_12_멘토링;
import java.util.*;


public class Main {
	public int solution(int n, int m, int[][] arr) {
		int answer = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				int count = 0;
				for (int k = 0; k < m; k ++) {
					int irank = 0;
					int jrank = 0;
					for (int s = 0; s < n; s++) {
						if(arr[k][s] == i) irank = s;
						if(arr[k][s] == j) jrank = s;
					}
					if(irank < jrank) count ++;
				}
				if (count == m) answer ++;
			}
		}
		return answer;
	}
	
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[][] arr = new int[m][n];
		for (int i = 0; i < m; i ++) {
			for (int j = 0;  j < n; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		System.out.println(T.solution(n, m, arr));
	}

}
