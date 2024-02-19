package section5_03_크레인인형뽑기;
import java.util.*;


public class Main {
	public int solution(int n, int[][] board, int m, int[] moves) {
		int answer = 0;
		Stack<Integer> stack = new Stack<>();
		for (int move: moves) {
			for (int i = 0; i < n; i++) {
				if (board[i][move - 1] != 0) {
					if(!stack.isEmpty() && stack.peek() == board[i][move-1]) {
						stack.pop();
						answer += 2;
					}
					else stack.push(board[i][move - 1]);
					board[i][move - 1] = 0;
					break;
				}
			}
		}
		return answer;
	}
	
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[][] board = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				board[i][j] = scan.nextInt();
			}
		}
		int m = scan.nextInt();
		int[] moves = new int[m];
		for (int i = 0; i < m; i++) {
			moves[i] = scan.nextInt();
		}
		System.out.println(T.solution(n, board, m, moves));
	}

}
