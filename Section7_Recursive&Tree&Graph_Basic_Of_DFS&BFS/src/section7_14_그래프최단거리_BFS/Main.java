package section7_14_그래프최단거리_BFS;
import java.util.*;


public class Main {
	static int n, m;
	static List<ArrayList<Integer>> graph;
	static int[] ch, dis;
	
	public void BFS(int v) {
		Queue<Integer> q = new LinkedList<>();
		ch[v] = 1;
		dis[v] = 0;
		q.offer(v);
		while (!q.isEmpty()) {
			int current = q.poll();
			for (int x : graph.get(current)) {
				if(ch[x] == 0) {
					ch[x] = 1;
					q.offer(x);
					dis[x] = dis[current] + 1;
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		m = scan.nextInt();
		graph = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i <= n; i++) {
			graph.add(new ArrayList<Integer>());
		}
		ch = new int[n+1];
		dis = new int[n+1];
		for (int i = 0; i < m; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			graph.get(a).add(b);
		}
		T.BFS(1);
		for (int i = 2; i <= n; i++) {
			System.out.println(i + " : " + dis[i]);
		}
	}

} 
