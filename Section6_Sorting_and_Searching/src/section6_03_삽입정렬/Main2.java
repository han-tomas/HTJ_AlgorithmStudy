package section6_03_삽입정렬;
import java.util.*;


public class Main2 {
	public int[] solution(int n, int[] arr) {
		for (int i = 1; i < n; i++) {
			int temp = arr[i]; int j;
			for (j = i - 1; j >= 0 ; j--) {
				if (arr[j] > temp) arr[j+1] = arr[j];
				else break;
			}
			arr[j+1] = temp;
		}
		return arr;
	}
	
	
	public static void main(String[] args) {
		Main2 T = new Main2();
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
