package section8_03_최대점수구하기_DFS;
import java.util.*;


public class Main {
	static int n, m, max = Integer.MIN_VALUE;
	
	public void DFS(int L, int ssum, int tsum, int[] score, int[] time) {
		if (tsum > m) return;
		if (L == n) {
			if(tsum <= m) {
				max = Math.max(ssum, max);
			}
		}
		else {
			DFS(L+1, ssum + score[L], tsum + time[L], score, time);
			DFS(L+1, ssum, tsum, score, time);
		}
	}
	
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		m = scan.nextInt();
		int[] score = new int[n];
		int[] time = new int[n];
		for (int i = 0 ; i < n; i++) {
			score[i] = scan.nextInt();
			time[i] = scan.nextInt();
		}
		T.DFS(0, 0, 0, score, time);
		System.out.println(max);
	}

}
