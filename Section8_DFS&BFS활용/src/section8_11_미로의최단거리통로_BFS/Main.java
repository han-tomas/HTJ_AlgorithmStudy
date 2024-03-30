package section8_11_미로의최단거리통로_BFS;
import java.util.*;


class Point{
	public int x, y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class Main {
	static int[][] miro, dis;
	static int[] dx={-1, 0, 1, 0};
	static int[] dy={0, 1, 0, -1};
	
	
	public void BFS(int x, int y) {
		Queue<Point> q = new LinkedList<>();
		q.offer(new Point(x, y));
		miro[x][y] = 1;
		while (!q.isEmpty()) {
			Point temp = q.poll();
			for (int i = 0; i < 4; i++) {
				int nx = temp.x + dx[i];
				int ny = temp.y + dy[i];
				if (nx >= 1 && nx <= 7 && ny >= 1 && ny <= 7 && miro[nx][ny]==0) {
					miro[nx][ny] = 1;
					q.offer(new Point(nx, ny));
					dis[nx][ny] = dis[temp.x][temp.y] + 1;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		miro = new int[8][8];
		dis = new int[8][8];
		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= 7; j++) {
				miro[i][j] = scan.nextInt();
			}
		}
		T.BFS(1, 1);
		if(dis[7][7] == 0) System.out.println(-1);
		else System.out.println(dis[7][7]);
	}

}
