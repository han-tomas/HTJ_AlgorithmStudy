package section2_05_소수_에라토스테네스의체;
import java.util.*;


public class Main {
	public int solution(int n) {
		int answer = 0;
		for (int i = 2; i <= n; i++) {
			int count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) count ++;
			}
			if(count == 2) answer ++;
		}
		return answer;
	}
	
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println(T.solution(n));
	}

}
