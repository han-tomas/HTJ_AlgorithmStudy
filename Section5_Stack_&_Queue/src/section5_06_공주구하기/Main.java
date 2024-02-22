package section5_06_공주구하기;
import java.util.*;


public class Main {
	public int solution(int n, int k) {
		Queue<Integer> q = new LinkedList<>();
		for (int i = 1; i <= n; i++) {
			q.offer(i);
		}
		while(q.size() != 1) {
			for(int i = 0; i < k-1; i++) {
				q.offer(q.poll());
			}
			q.poll();
		}
		return q.poll();
	}
	
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		System.out.println(T.solution(n, k));
	}

}
