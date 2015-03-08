package exam3.Tree;

public class TreeNode {
	int id;
	TreeNode left;
	TreeNode right;
	
	TreeNode(int id) {
		this.id = id;
	}
	
	public void add(int V) {
		// check V against id
		// if V > id:
		//   check if right is null
		//      if yes: create TreeNode and assign to right
		//      else: right.add(V)
		// else if V < id:
		//   check if left is null
		//      if yes: create TreeNode and assign to left
		//      else: left.add(V)
		// else:
		//    return
	}
}
