package section6_08_이분검색;
import java.util.*;


public class Main2 {
	static int n;
	static int m;
	static int[] arr;
	
	public void solution(int lt, int rt, int[] arr) {
		int mid = (lt + rt) / 2;
		if(arr[mid] == m) System.out.println(mid + 1);
		else if(m < arr[mid]) solution(lt, mid - 1, arr);
		else solution(mid + 1, rt, arr);
	}
	
	
	public static void main(String[] args) {
		Main2 T = new Main2();
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		m = scan.nextInt();
		arr = new int[n];
		for (int i = 0; i < n; i ++) {
			arr[i] = scan.nextInt();
		}
		Arrays.sort(arr);
		T.solution(0, n - 1, arr);
	}

}
