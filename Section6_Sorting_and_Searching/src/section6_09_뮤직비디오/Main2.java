package section6_09_뮤직비디오;
import java.util.*;


public class Main2 {
	public int count(int [] arr, int capacity) {
		int count = 1;
		int sum = 0;
		for (int x: arr) {
			sum += x;
			if(sum > capacity) {
				count ++;
				sum = x;
			}
		}
		return count;
	}
	
	
	public int solution(int n, int m, int[] arr) {
		int answer = 0;
		int lt = Arrays.stream(arr).max().getAsInt();
		int rt = Arrays.stream(arr).sum();
		while (lt <= rt) {
			int mid = (lt + rt) / 2;
			if(count(arr, mid) <= m) {
				answer = mid;
				rt = mid - 1;
			}
			else lt = mid + 1;
			
		}
		return answer;
	}
	
	
	public static void main(String[] args) {
		Main2 T = new Main2();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i ++) {
			arr[i] = scan.nextInt();
		}
		System.out.println(T.solution(n, m, arr));
	}

}
