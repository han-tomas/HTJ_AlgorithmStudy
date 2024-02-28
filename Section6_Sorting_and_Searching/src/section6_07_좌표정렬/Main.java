package section6_07_좌표정렬;
import java.util.*;


class Point1 implements Comparable<Point1>{
	int x;
	int y;
	public Point1(int x, int y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public int compareTo(Point1 o) {
		if(this.x == o.x) return this.y - o.y;
		else return this.x - o.x;
	}
}


public class Main {
	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		List<Point1> list = new ArrayList<>();
		for (int i = 0; i < n; i ++) {
			int x = scan.nextInt();
			int y = scan.nextInt();
			list.add(new Point1(x, y));
		}
		Collections.sort(list);
		for (Point1 s : list) {
			System.out.println(s.x + " " + s.y);
		}
	}

}
