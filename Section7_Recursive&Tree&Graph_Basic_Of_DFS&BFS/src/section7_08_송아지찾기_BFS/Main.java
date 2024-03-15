package section7_08_송아지찾기_BFS;
import java.util.*;


public class Main {
	int answer = 0;
	int[] dx = {1, -1, 5};
	int[] ch;
	Queue<Integer> q = new LinkedList<>();
	
	
	public int BFS(int hyun, int cow) {
		ch = new int[10001];
		ch[hyun] = 1;
		q.offer(hyun);
		int L = 0;
		while(!q.isEmpty()) {
			int len = q.size();
			for (int i = 0; i < len; i++) {
				int x = q.poll();
				if (x == cow) return L;
				for (int j = 0; j < dx.length; j++) {
					int nx = x + dx[j]; 
					if (nx >= 1 && nx <= 10000 && ch[nx] == 0) {
						ch[nx] = 1;
						q.offer(nx);
					}
				}
			}
			L++;
		}
		return -1;
	}
	
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		int hyun = scan.nextInt();
		int cow = scan.nextInt();
		System.out.println(T.BFS(hyun, cow));
	}
}
