package section3_01_두배열합치기;
import java.util.*;


public class Main {
	public List<Integer> solution(int[] arr1, int[] arr2){
		List<Integer> list = new ArrayList<>();
		int p1 = 0;
		int p2 = 0;
		while(p1 < arr1.length && p2 < arr2.length) {
			if(arr1[p1] < arr2[p2]) list.add(arr1[p1++]);
			else list.add(arr2[p2++]);
		}
		while(p1 < arr1.length) list.add(arr1[p1++]);
		while(p2 < arr2.length) list.add(arr2[p2++]);
		return list;
	}
	
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr1 = new int[n];
		for (int i = 0; i < n; i++) {
			arr1[i] = scan.nextInt();
		}
		int m = scan.nextInt();
		int[] arr2 = new int[m];
		for (int i = 0; i < m; i++) {
			arr2[i] = scan.nextInt();
		}
		for (int x: T.solution(arr1, arr2)) {
			System.out.print(x + " ");
		}
	}

}
