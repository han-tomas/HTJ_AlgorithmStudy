package section4_03_매출액의종류;
import java.util.*;


public class Main {
	public List<Integer> solution(int n, int k, int[] arr){
		List<Integer> list = new ArrayList<>();
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < k - 1; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
		}
		int lt = 0;
		for (int rt = k - 1; rt < n; rt ++ ) {
			map.put(arr[rt], map.getOrDefault(arr[rt], 0)+1);
			list.add(map.size());
			map.put(arr[lt], map.get(arr[lt]) - 1);
			if(map.get(arr[lt]) == 0) {
				map.remove(arr[lt]);
			}
			lt ++;
		}
		return list;
	}
	
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		int k = scan.nextInt();
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		for (int x: T.solution(n, k, arr)) {
			System.out.print(x + " ");
		}
	}

}
