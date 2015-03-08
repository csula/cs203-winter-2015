package homework3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Node {
	String name;
	boolean visited = false;
	ArrayList<Node> children = new ArrayList<Node>();
	
	public String toString() { return "(" + name + ":" + visited + ")"; }
	public Node(String name) { this.name = name; }
}

public class BFS {

	Node root = new Node("root");
	
	public static void main(String[] args) {
		BFS b = new BFS();
		b.bfs();
		b.bfs();
	}

	public void bfs() {
		Queue<Node> queue = new LinkedList<Node>();
		queue.add( root );
		System.out.println( root );
		root.visited = true;
		while(queue.isEmpty() == false) {
			Node node = queue.remove();
			for (Node child : node.children) {
				if (child.visited == false) {
					child.visited = true;
					System.out.println( child );
					queue.add( child );
				}
			}
		}
	}
}
