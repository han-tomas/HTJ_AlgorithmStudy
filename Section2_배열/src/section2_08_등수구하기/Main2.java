package section2_08_등수구하기;
import java.util.*;


public class Main2 {
	public List<Integer> solution(int[] arr){
		List<Integer> list = new ArrayList<>();
		for(int i = 0 ; i<arr.length ; i++) {
			int rank = 1;
			for(int j = 0 ; j<arr.length ; j++) {
				if(arr[i]<arr[j]) rank++;
			}
			list.add(rank);
		}
		return list;
	}
	
	
	public static void main(String[] args) {
		Main2 T = new Main2();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		for (int x: T.solution(arr)) {
			System.out.print(x + " ");
		}
	}

}
