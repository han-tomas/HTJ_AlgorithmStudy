package section7_14_그래프최단거리_BFS;
import java.util.*;


public class Main2 {
	static int n, m;
	static int[][] graph;
	static int[] ch, dis;
	
	
	public void BFS(int v) {
		Queue<Integer> q = new LinkedList<>();
		q.offer(v);
		ch[1] = 1;
		dis[1] = 0;
		while(!q.isEmpty()) {
			int len = q.size();
			for (int i = 0; i < len; i++) {
				int current = q.poll();
				for (int j = 1; j <= n; j++) {
					if(graph[current][j] == 1 && ch[j] == 0) {
						ch[j] = 1;
						dis[j] = dis[current]+ 1;
						q.offer(j);
					}
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
		Main2 T = new Main2();
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		m = scan.nextInt();
		ch = new int[n+1];
		dis = new int[n+1];
		graph = new int[n+1][n+1];
		for (int i = 0 ;i < m; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			graph[a][b] = 1;
		}
		T.BFS(1);
		for (int i = 2; i <= n; i++) {
			System.out.println(i + " : " + dis[i]);
		}
	}
 
}
