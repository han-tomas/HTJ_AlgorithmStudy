package section6_05_중복확인;
import java.util.*;


public class Main {
	public char solution(int n, int[] arr) {
		char answer = 'U';
		Arrays.sort(arr);
		for (int i = 0; i < n - 1; i++) {
			if(arr[i] == arr[i+1]) {
				answer = 'D';
				break;
			}
		}
		return answer;
	}
	
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		for (int i = 0 ; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println(T.solution(n, arr));
	}

}
