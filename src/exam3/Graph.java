package exam3;

import java.util.HashMap;
import java.util.Map;

public class Graph {
	Map<Integer,Vertex> vTable = new HashMap<Integer,Vertex>();
	
	public Graph(String filename) {
		// The constructor reads the contents of filename into the graph
		
		// 1. read into ArrayList<String> lines
		
		// 2. build vertices by iterating over lines
		
		// 3. build edges by iterating over lines
		//    a. string line = lines[k]
		//    b. string[] words = line.split()
		//    c. vertex v1 = words[0]
		//    d. int N = (words.length - 1)/2
		//    e. for k = 1 ... N
		//       vertex v2 = Graph.getVertex(word[k])
		//       weight w = words[k+1]
		//       edge e = new Edge(v1,v2,w) 
		//       v1.add(e), v2.add(e)
	}
}
