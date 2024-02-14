package section2_08_등수구하기;
import java.util.*;


public class Main {
	public List<Integer> solution(int n,int[] arr){
		List<Integer> list = new ArrayList<>();
		Integer[] temp = new Integer[n];
		for (int i = 0; i < n; i++) {
			temp[i] = arr[i];
		}
		Arrays.sort(temp, Collections.reverseOrder());
		for (int x: arr) {
			list.add(Arrays.asList(temp).indexOf(x)+1);
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
