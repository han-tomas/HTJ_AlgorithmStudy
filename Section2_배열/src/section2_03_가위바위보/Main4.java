package section2_03_가위바위보;

import java.util.*;

public class Main4 {
	public List<String> solution(int[] A, int[] B){
		List<String> list = new ArrayList<>();
		for (int i = 0; i < A.length; i++) {
			if(A[i] - B[i] == 1 || B[i] - A[i] == 2) list.add("A");
			else if(B[i] - A[i] == 1 || A[i] - B[i] == 2) list.add("B");
			else list.add("D");
		}
		return list;
	}
	
	
	public static void main(String[] args) {
		Main4 T = new Main4();
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
