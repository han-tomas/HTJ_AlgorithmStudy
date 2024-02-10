package section2_01_큰수출력하기;
import java.util.*;


public class Main {
	public List<Integer> solution(int[] arr) {
		List<Integer> list = new ArrayList<>();
		list.add(arr[0]);
		for(int i = 1; i < arr.length; i++) {
			if(arr[i]>arr[i-1]) list.add(arr[i]);
		}
		return list;
	}
	
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		for(int x: T.solution(arr)) {
			System.out.print(x + " ");
		}
	}

}
