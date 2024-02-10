package section2_03_가위바위보;

import java.util.*;

public class Main2 {
	public List<String> solution(int[] A, int[] B){
		List<String> list = new ArrayList<>();
		for (int i = 0; i < A.length; i++) {
			if((A[i] == 1 && B[i] == 2)
					|| (A[i] == 2 && B[i] == 3) 
						|| (A[i] == 3 && B[i] == 1)) list.add("B");
			else if((A[i] == 2 && B[i] == 1) 
						|| (A[i] == 3 && B[i] == 2)
							|| (A[i] == 1 && B[i] == 3)) list.add("A");
			else list.add("D");
		}
		return list;
	}
	
	
	public static void main(String[] args) {
		Main2 T = new Main2();
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
