package section1_09_숫자만추출;
import java.util.*;


public class Main {
	public int solution(String s) {
		int answer = 0;
		s = s.replaceAll("[^0-9]", "");
		answer = Integer.parseInt(s);
		return answer;
	}
	
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		System.out.println(T.solution(s));

	}

}
