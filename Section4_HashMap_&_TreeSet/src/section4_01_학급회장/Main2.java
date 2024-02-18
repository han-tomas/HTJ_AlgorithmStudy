package section4_01_학급회장;
import java.util.*;


public class Main2 {
	public char solution(String s) {
		char answer = ' ';
		Map<Character, Integer> map = new HashMap<>();
		for (char x: s.toCharArray()) {
			map.put(x, map.getOrDefault(x, 0) + 1);
		}
		int max = Integer.MIN_VALUE;
		for (char key: map.keySet()) {
			if (max < map.get(key)) {
				max = map.get(key);
				answer = key;
			}
		}
		return answer;
	}
	
	
	public static void main(String[] args) {
		Main2 T = new Main2();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String s = scan.next();
		System.out.println(T.solution(s));
	}

}
