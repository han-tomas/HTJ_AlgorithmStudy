package section2_04_피보나치수열;
import java.util.*;


public class Main {
	public int[] solution(int n){
		int[] arr = new int[n];
		arr[0] = 1;
		arr[1] = 1;
		for (int i = 2; i < n; i++) {
			arr[i] = arr[i - 2] + arr[i - 1];
		}
		return arr;
	}
	
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for (int x: T.solution(n)) {
			System.out.print(x + " ");
		}
	}

}
