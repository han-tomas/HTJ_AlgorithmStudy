package section4_01_학급회장;
import java.util.*;


public class Main {
	public char solution(String s) {
		char answer = ' ';
		int max = Integer.MIN_VALUE;
		Map<Character, Integer> map = new HashMap<>();
		for (char x: s.toCharArray()) {
			map.put(x, map.getOrDefault(x, 0)+1);
			if(max < map.get(x)) {
				max = map.get(x);
				answer = x;
			}
		}
		
		return answer;
	}
	
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String s = scan.next();
		System.out.println(T.solution(s));
	}

}
