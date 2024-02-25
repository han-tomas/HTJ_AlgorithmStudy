package section6_01_선택정렬;
import java.util.*;


public class Main {
	public int[] solution (int n, int[] arr) {
		for (int i = 0; i < n - 1; i++) {
			int index = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[index]) index = j;
			}
			int temp = arr[i];
			arr[i] = arr[index];
			arr[index] = temp;
		}
		return arr;
	}
	
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		for (int x: T.solution(n, arr)) {
			System.out.print(x + " ");
		}
	}
}
