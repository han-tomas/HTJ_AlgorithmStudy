package section5_06_공주구하기;
import java.util.*;


public class Main2 {
	public int solution(int n, int k) {
		int answer = 0; 
		Queue<Integer> q = new LinkedList<Integer>();
		for (int i = 1; i <= n; i++) {
			q.offer(i);
		}
		while(!q.isEmpty()) {
			for (int i = 1; i < k; i++) {
				q.offer(q.poll());
			}
			q.poll();
			if(q.size() == 1) answer = q.poll();
		}
		return answer;
	}
	public static void main(String[] args) {
		Main2 T = new Main2();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		System.out.println(T.solution(n, k));
	}

}
