package section3_01_두배열합치기;
import java.util.*;


public class Main2 {
	public List<Integer> solution(int[] arr1, int[] arr2){
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < arr1.length; i++) {
			list.add(arr1[i]);
		}
		for (int i = 0; i < arr2.length; i++) {
			list.add(arr2[i]);
		}
		Collections.sort(list);
		return list;
	}
	
	
	public static void main(String[] args) {
		Main2 T = new Main2();
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
