package section3_02_공통원소구하기;
import java.util.*;


public class Main {
	public List<Integer> solution(int[] arr1, int[] arr2){
		List<Integer> list = new ArrayList<>();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int p1 = 0;
		int p2 = 0;
		while(p1 < arr1.length && p2 < arr2.length) {
			if (arr1[p1] == arr2[p2]) {
				list.add(arr1[p1++]);
				p2++;
			}
			else if(arr1[p1]< arr2[p2]) p1++;
			else p2 ++;
		}
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
