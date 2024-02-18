package section4_05_K번째큰수;
import java.util.*;


public class Main {
	public int solution(int n, int k, int[] arr) {
		Set<Integer> set = new TreeSet<>(Collections.reverseOrder());
		for (int i = 0; i < n-2; i ++) {
			for (int j = i + 1; j < n - 1; j ++) {
				for (int l = j + 1; l < n; l++) {
					int sum = arr[i]+arr[j]+arr[l];
					set.add(sum);
				}
			}
		}
		int count = 1;
		for (int x: set) {
			if (count == k) return x;
			count ++;
		}
		return -1;
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		int k = scan.nextInt();
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println(T.solution(n, k, arr));
	}

}
