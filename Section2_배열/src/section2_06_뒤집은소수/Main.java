package section2_06_뒤집은소수;
import java.util.*;


public class Main {
	public boolean isPrime(int n) {
		boolean isPrime = true;
		if(n == 1) return false;
		else {
			for(int i = 2; i<n ; i++) {
				if(n%i==0) return false;
			}
		}
		return isPrime;
	}
	
	
	public List<Integer> solution(int n,String[] arr) {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			String s = new StringBuffer(arr[i]).reverse().toString();
			int temp = Integer.parseInt(s);
			if(isPrime(temp)) list.add(temp);
		}
		return list;
	}
	
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String[] arr = new String[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scan.next();
		}
		for(int x: T.solution(n, arr)) {
			System.out.print(x + " ");
		}
	}

}
