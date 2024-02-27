package section6_04_Least_Recently_Used;
import java.util.*;


public class Main {
	public int[] solution(int s, int n, int[] arr) {
		int[] cache = new int[s];
		for (int x: arr) {
			int p = -1;
			for (int i = 0; i < s; i++) {
				if (cache[i] == x) {
					p = i;
					break;
				}
			}
			if (p == -1) {
				for (int i = s - 1; i >= 1; i--) {
					cache[i] = cache[i-1];
				}
				cache[0] = x;
			}
			else {
				for (int i = p; i >= 1; i--) {
					cache[i] = cache[i-1];
				}
				cache[0] = x;
			}
		}
		return cache;
	}
	
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		int s = scan.nextInt();
		int n = scan.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i ++) {
			arr[i] = scan.nextInt();
		}
		for (int x: T.solution(s, n, arr)) {
			System.out.print(x + " ");
		}
	}
}
