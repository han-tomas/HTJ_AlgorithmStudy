package section7_10_Tree말단노드까지의가장짧은경로_BFS;

import java.util.LinkedList;
import java.util.Queue;

class Node{
	int data;
	Node lt, rt;
	public Node(int val) {
		data = val;
		lt = rt = null;
	}
}


public class Main {
	Node root;
	public int BFS(Node root) {
		Queue<Node> q = new LinkedList<>();
		q.offer(root);
		int L = 0;
		while(!q.isEmpty()) {
			int len = q.size();
			for (int i = 0; i < len; i++) {
				Node current = q.poll();
				if (current.lt == null && current.rt == null) return L;
				if (current.lt != null) q.offer(current.lt);
				if (current.rt != null) q.offer(current.rt);
			}
			L++;
		}
		return -1;
	}
	
	
	public static void main(String[] args) {
		Main tree = new Main();
		tree.root = new Node(1);
		tree.root.lt = new Node(2);
		tree.root.rt = new Node(3);
		tree.root.lt.lt = new Node(4);
		tree.root.lt.rt = new Node(5);
		System.out.println(tree.BFS(tree.root));

	}

}
