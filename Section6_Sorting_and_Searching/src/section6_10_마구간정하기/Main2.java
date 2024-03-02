package section6_10_마구간정하기;
import java.util.*;


public class Main2 {
	public int count(int[] arr, int distance) {
		int count = 1;
		int point = arr[0];
		for (int i = 1; i < arr.length; i ++) {
			if (arr[i] - point > distance) {
				count ++;
				point = arr[i];
			}
		}
		return count;
	}
	
	
	public int solution(int n, int c, int[] arr) {
		int answer = 0;
		Arrays.sort(arr);
		int lt = arr[1] - arr[0];
		int rt = arr[n - 1] - arr[0];
		while (lt <= rt) {
			int mid = (lt + rt) / 2;
			if (count(arr , mid) >= c) {
				answer = mid;
				lt = mid + 1;
			}
			else rt = mid - 1;
		}
		return answer;
	}
	
	
	public static void main(String[] args) {
		Main2 T = new Main2();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int c = scan.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i ++) {
			arr[i] = scan.nextInt();
		}
		System.out.println(T.solution(n, c, arr));
	}

}
