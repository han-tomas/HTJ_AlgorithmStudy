package section2_07_점수계산;
import java.util.*;


public class Main2 {
	public int solution(int[] arr) {
		int answer = 0;
		int score = 1;
		for (int x: arr) {
			if(x == 1) {
				answer += score;
				score ++;
			}
			else score = 1;
		}
		return answer;
	}
	
	
	public static void main(String[] args) {
		Main2 T = new Main2();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println(T.solution(arr));
	}

}
