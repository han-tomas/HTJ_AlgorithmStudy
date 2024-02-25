package section5_08_응급실;
import java.util.*;

class Patient{
	int warn;
	int order;
	public Patient(int warn, int order) {
		this.warn = warn;
		this.order = order;
	}
}


public class Main {
	public int solution(int n, int m, int[] arr) {
		int answer = 0;
		Queue<Patient> q = new LinkedList<>();
		for (int i = 0; i < n; i++) {
			q.add(new Patient(arr[i], i));
		}
		while(!q.isEmpty()) {
			Patient temp = q.poll();
			for (Patient x: q) {
				if(x.warn > temp.warn) {
					q.offer(temp);
					temp = null;
					break;
				}
			}
			if (temp != null) {
				answer ++;
				if (temp.order == m) return answer;
			}
		}
		return answer;
	}
	
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println(T.solution(n, m, arr));
	}

}
