package section7_04_피보나치수열;
import java.util.*;


public class Main2 {
	static int[] arr;
	
	
	public int solution(int n) {
		if(n == 1) return arr[n] = 1;
		else if(n == 2) return arr[n] = 1;
		else return arr[n] = solution(n - 1) + solution(n - 2);
	}
	
	
	public static void main(String[] args) {
		Main2 T = new Main2();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		arr = new int[n + 1];
		T.solution(n);
		for (int i = 1; i <= n; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}

}
