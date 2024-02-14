package section2_10_봉우리;
import java.util.*;


public class Main2 {
	int[] dx = {0 , 1, 0, -1};
	int[] dy = {-1, 0, 1, 0}; 
	public int solution(int n, int[][] arr) {
		int answer = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				boolean bCheck = true;
				for (int k = 0; k < 4; k++) {
					int x = i + dx[k];
					int y = j + dy[k];
					if (x >= 0 && x < n && y >= 0 && y < n && arr[i][j] <= arr[x][y]) {
						bCheck = false;
						break;
					}
				}
				if (bCheck) answer ++;
				
			}
		}
		return answer;
	}
	
	
	public static void main(String[] args) {
		Main2 T = new Main2();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[][] arr = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		System.out.println(T.solution(n, arr));
	}

}
