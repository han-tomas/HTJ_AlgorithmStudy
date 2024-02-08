package section1_03_문장속단어;
import java.util.*;


public class Main {
	public String solution(String s) {
		System.out.println(s);
		String answer = "";
		int max = Integer.MIN_VALUE;
		String[] input = s.split(" ");
		for(String x: input) {
			if(x.length() > max) {
				max = x.length();
				answer = x;
			}
		}
		return answer;
	}
	
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		System.out.println(T.solution(s));
	}

}
