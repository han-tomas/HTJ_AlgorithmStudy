package section3_06_최대길이연속부분수열;
import java.util.*;


public class Main {
	public int solution(int n, int k, int[] arr) {
		int max = Integer.MIN_VALUE;
		int lt = 0;
		int count = 0;
		for (int rt = 0; rt < n; rt++) {
			if(arr[rt] == 0) count ++;
			while(count > k) {
				if(arr[lt] == 0) count --;
				lt ++;
			}
			max = Math.max(max, rt - lt + 1);
		}
		return max;
	}
	
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		int k = scan.nextInt();
		for (int i  = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println(T.solution(n, k, arr));
	}

}
