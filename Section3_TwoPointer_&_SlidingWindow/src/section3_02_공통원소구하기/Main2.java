package section3_02_공통원소구하기;
import java.util.*;


public class Main2 {
	public List<Integer> solution(int[] arr1, int[] arr2){
		List<Integer> list = new ArrayList<>();
		int[] temp = new int[arr1.length + arr2.length];
		for (int i = 0; i < arr1.length; i++) {
			temp[i] = arr1[i];
		}
		int index = arr1.length;
		for (int x: arr2) {
			temp[index++] = x;
		}
		Arrays.sort(temp);
		for (int i = 1; i < temp.length; i++) {
			if(temp[i] == temp[i-1]) list.add(temp[i]);
		}
		
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
