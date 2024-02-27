package section6_06_장난꾸러기;
import java.util.*;


public class Main {
	public List<Integer> solution(int n, int[] arr){
		List<Integer> list = new ArrayList<>();
		int[] temp = arr.clone();
		Arrays.sort(temp);
		for(int i = 0; i < n; i++) {
			if(arr[i] != temp[i]) list.add(i+1);
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
		for (int x: T.solution(n, arr)) {
			System.out.print(x + " ");
		}
	}

}
