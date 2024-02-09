package section1_06_중복문자제거;
import java.util.*;


public class Main {
	public Set<Character> solution(String s){
		Set<Character> set = new LinkedHashSet<>();
		for (char c: s.toCharArray()) {
			set.add(c);
		}
		return set;
	}
	
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		for(char x: T.solution(s)) {
			System.out.print(x);
		}
	}

}
