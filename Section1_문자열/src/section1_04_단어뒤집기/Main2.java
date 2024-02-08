package section1_04_단어뒤집기;
import java.util.*;


public class Main2 {
	public List<String> solution(String[] s) {
		List<String> list = new ArrayList<>();
		for (String x: s) {
			StringBuilder sb = new StringBuilder(x);
			list.add(sb.reverse().toString());
		}
		return list;
	}
	
	
	public static void main(String[] args) {
		Main2 T = new Main2();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String[] s = new String[n];
		for (int i = 0; i < n; i++) {
			s[i] = scan.next();
		}
		for (String x: T.solution(s)) {
			System.out.println(x);
		}
	}

}
