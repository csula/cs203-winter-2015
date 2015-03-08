package homework3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Vertex {
	String name;
	boolean visited = false;
	ArrayList<Vertex> neighbors = new ArrayList<Vertex>();
	
	public String toString() { return "(" + name + ":" + visited + ")"; }
	public Vertex(String name) { this.name = name; }
}

public class BFS {

	public void bfs(Vertex start, Vertex end) {
		Queue<Vertex> queue = new LinkedList<Vertex>();
		queue.add(start);
		System.out.println(start);
		start.visited = true;
		while(queue.isEmpty() == false) {
			Vertex node = queue.remove();
			for (Vertex neighbor : node.neighbors) {
				if (neighbor.visited == false) {
					neighbor.visited = true;
					System.out.println(neighbor);
					queue.add(neighbor);
				}
			}
		}
	}
}
