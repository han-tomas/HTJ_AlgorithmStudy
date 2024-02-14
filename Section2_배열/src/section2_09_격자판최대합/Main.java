package section2_09_격자판최대합;
import java.util.*;


public class Main {
	public int solution(int[][] arr) {
		int answer = 0;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for(int j = 0; j < arr.length; j++) {
				sum += arr[i][j];
			}
			max = Math.max(max, sum);
		}
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for(int j = 0; j < arr.length; j++) {
				sum += arr[j][i];
			}
			max = Math.max(max, sum);
		}
		int sum1 = 0;
		int sum2 = 0;
		for (int i = 0; i < arr.length; i ++) {
			sum1 += arr[i][i];
			sum2 += arr[(arr.length - 1) - i][(arr.length - 1) - i];
		}
		max = Math.max(max, sum1);
		max = Math.max(max, sum2);
		answer = max;
		return answer;
	}
	
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[][] arr = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		System.out.println(T.solution(arr));
	}

}
