package section2_11_임시반장정하기;
import java.util.*;


public class Main {
	public int solution(int n, int[][] arr) {
		int answer = 0;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			int count = 0;
			for (int j = 0; j < n; j++) {
				for(int k = 0 ; k<5 ; k++) {
					if(arr[i][k]==arr[j][k]) {
						count++;
						break;
					}
				}
			}
			if(count>max) {
				answer = i+1;
				max = count;
			}
		}
		return answer;
	}
	
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[][] arr = new int[n][5];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 5; j ++) {
				arr[i][j] = scan.nextInt();
			}
		}
		System.out.println(T.solution(n, arr));
	}

}
