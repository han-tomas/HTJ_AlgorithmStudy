package section2_03_가위바위보;
import java.util.*;


public class Main3 {
	public List<String> solution(int[] A, int[] B){
		List<String> list = new ArrayList<>();
		for (int i = 0; i < A.length; i++) {
			if (Math.abs(A[i]-B[i]) == 1) {
				if(A[i] > B[i]) list.add("A");
				else list.add("B");
			} 
			else if (Math.abs(A[i]-B[i]) ==2) {
				if(A[i] > B[i]) list.add("B");
				else list.add("A");
			}
			else list.add("D");
		}
		return list;
	}
	
	
	public static void main(String[] args) {
		Main3 T = new Main3();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] A = new int[n];
		int[] B = new int[n];
		for (int i = 0; i < n; i++) {
			A[i] = scan.nextInt();
		}
		for (int i = 0; i < n; i++) {
			B[i] = scan.nextInt();
		}
		for (String x: T.solution(A, B)) {
			System.out.println(x);
		}
	}

}
