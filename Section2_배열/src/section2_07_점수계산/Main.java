package section2_07_점수계산;
import java.util.*;


public class Main {
	public int solution(int n, int[] arr) {
		int answer = 0;
		int[] result = new int[n];
		if (arr[0] == 1) result[0] = 1; 
		int score = 1;
		for (int i = 1; i < n; i++) {
			if (arr[i] == 1) {
				if (arr[i] == arr[i-1]) score ++;
				else score = 1;
				result[i] = score;
			}
		}
		for (int i = 0; i < n; i++) {
			answer += result[i];
		}
		return answer;
	}
	
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println(T.solution(n, arr));
	}

}
