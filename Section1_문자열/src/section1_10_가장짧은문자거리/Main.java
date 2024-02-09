package section1_10_가장짧은문자거리;
import java.util.*;


public class Main {
	public List<Integer> solution(String s, char c){
		List<Integer> list = new ArrayList<>();
		int[] lt = new int[s.length()];
		int[] rt = new int[s.length()];
		int count = 1000;
		for(int i = 0; i<s.length(); i++) {
			if(s.charAt(i) == c) count = 0;
			lt[i] = count;
			count ++;
		}
		for(int i = s.length() - 1; i >= 0; i--) {
			if(s.charAt(i) == c) count = 0;
			rt[i] = count;
			count ++;
		}
		for (int i = 0; i<s.length(); i++) {
			list.add(Math.min(lt[i], rt[i]));
		}
		return list;
	}
	
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		char c = scan.next().charAt(0);
		for (int x: T.solution(s, c)) {
			System.out.print(x + " ");
		}
	}

}
