package section7_13_경로탐색_인접리스트_DFS;
import java.util.*;


public class Main {
	static int n, m, answer = 0;
	static List<ArrayList<Integer>> graph;
	static int[] ch;
	
	
	public void DFS(int v) {
		if (v == n) answer ++;
		else {
			for (int x : graph.get(v)) {
				if (ch[x] == 0) {
					ch[x] = 1;
					DFS(x);
					ch[x] = 0;
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
		for (int i = 0; i < n; i ++) {
			graph.add(new ArrayList<Integer>());
		}
		ch = new int[n+1];
		for (int i = 0; i < m; i++) {
			int a = scan.nextInt();
			int b= scan.nextInt();
			graph.get(a).add(b);
		}
		ch[1] = 1;
		T.DFS(1);
		System.out.println(answer);
	}

}
