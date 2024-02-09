package section1_10_가장짧은문자거리;
import java.util.*;


public class Main2 {
	public int[] solution(String s, char c) {
		int[] arr = new int[s.length()];
		int count = 1000;
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == c) count = 0;
			arr[i] = count;
			count ++;
		}
		for (int i = s.length() - 1; i >= 0; i--) {
			if(s.charAt(i) == c) count = 0;
			arr[i] = Math.min(arr[i], count);
			count ++;
		}
		return arr;
	}
	
	
	public static void main(String[] args) {
		Main2 T = new Main2();
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		char c = scan.next().charAt(0);
		for (int x: T.solution(s, c)) {
			System.out.print(x + " ");
		}
	}

}
