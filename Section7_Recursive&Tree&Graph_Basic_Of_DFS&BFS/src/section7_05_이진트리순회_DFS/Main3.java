package section7_05_이진트리순회_DFS;


public class Main3 {
	Node root;
	public void DFS(Node root) {
		if (root == null) return;
		else {
			DFS(root.lt);
			DFS(root.rt);
			System.out.print(root.data + " ");
		}
	}
	public static void main(String[] args) {
		Main3 tree = new Main3();
		tree.root = new Node(1);
		tree.root.lt = new Node(2);
		tree.root.rt = new Node(3);
		tree.root.lt.lt = new Node(4);
		tree.root.lt.rt = new Node(5);
		tree.root.rt.lt = new Node(6);
		tree.root.rt.rt = new Node(7);
		tree.DFS(tree.root);

	}

}
