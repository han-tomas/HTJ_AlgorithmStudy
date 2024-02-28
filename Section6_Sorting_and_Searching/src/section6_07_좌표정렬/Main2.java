package section6_07_좌표정렬;
import java.util.*;


class Point2 {
	int x;
	int y;
	public Point2(int x, int y) {
		this.x = x;
		this.y = y;
	}
}


public class Main2 {

	public static void main(String[] args) {
		Main2 T = new Main2();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		List<Point2> list = new ArrayList<>();
		for (int i = 0; i < n; i ++) {
			int x = scan.nextInt();
			int y = scan.nextInt();
			list.add(new Point2(x, y));
		}
		Collections.sort(list, new Comparator<Point2>() {

			@Override
			public int compare(Point2 o1, Point2 o2) {
				if(o1.x == o2.x) return o1.y - o2.y;
				else return o1.x - o2.x;
			}
			
		});
		for (Point2 o: list) {
			System.out.println(o.x + " " + o.y);
		}
	}

}
