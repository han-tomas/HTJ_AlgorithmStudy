package section6_03_삽입정렬;
import java.util.*;


public class Main {
	public int[] solution(int n, int[] arr) {
		for (int i = 1; i < n; i++) {
			int temp = arr[i];
			for (int j = i - 1; j >= 0; j--) {
				if(arr[j] > temp) {
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
				else break;
			}
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
		for(int x: T.solution(n, arr)) {
			System.out.print(x + " ");
		}
	}

}
