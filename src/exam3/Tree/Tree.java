package exam3.Tree;

public class Tree {
	TreeNode root;
	
	void traverseInorder(TreeNode node) {
		// check to see if node is null: if yes, done!
		// traverseInorder(node.left)
		// print(node)
		// traverseInorder(node.right)
	}
	
	void Add(int V) {
		if (root == null) {
			root = new TreeNode(V);
		} else {
			root.add(V);
		}
	}
	
}
