package section3_04_연속부분수열;
import java.util.*;


public class Main {
	public int solution(int n, int m,int[] arr) {
		int answer = 0;
		int sum = 0;
		int lt = 0;
		for (int rt = 0; rt < n; rt++) {
			sum += arr[rt];
			while (sum > m && lt < rt) {
				sum -= arr[lt];
				lt ++;
			}
			if(sum == m) answer ++;
		}
		return answer;
	}
	
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println(T.solution(n, m, arr));
	}
}
