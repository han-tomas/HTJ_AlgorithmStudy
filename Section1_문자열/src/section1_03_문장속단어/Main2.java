package section1_03_문장속단어;
import java.io.*;


public class Main2 {
	public String solution(String s) {
		s += " "; // 맨 뒤에 공백을 추가해 준다.
		String answer = "";
		String word = "";
		int max = Integer.MIN_VALUE;
		int count = 0;
		for (char x: s.toCharArray()) {
			if (Character.isAlphabetic(x)) {
				count ++;
				word += x;
			}
			else {
				if(count > max) {
					max = count;
					answer = word;
					count = 0;
					word = "";
				}
				else {
					count = 0;
					word = "";
				}
			}
		}
		return answer;
	}
	
	
	public static void main(String[] args) throws IOException {
		Main2 T = new Main2();
		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		System.out.println(T.solution(s));
	}

}
