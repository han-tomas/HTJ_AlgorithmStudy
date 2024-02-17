package section3_05_연속된자연수의합;
import java.util.*;


public class Main2 {
	public int solution(int n) {
		int answer = 0; 
		int count = 1;
		n = n - count;
		while(n > 0) {
			count ++;
			n = n - count;
			if (n % count == 0) answer ++;
		}
		return answer;
	}
	
	
	public static void main(String[] args) {
		Main2 T = new Main2();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println(T.solution(n));
	}

}
