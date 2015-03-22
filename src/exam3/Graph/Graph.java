package exam3.Graph;

import java.util.HashMap;
import java.util.Map;

public class Graph {
	Map<Integer,Vertex> vTable = new HashMap<Integer,Vertex>();
	
	public Graph(String filename) {
		// The constructor reads the contents of filename into the graph
		// Warnings: don't double count the edges when adding be careful with vertex number labeling
		
		// 1. read into ArrayList<String> lines
		
		// 2. build vertices by iterating over lines  
		// 		i = 0 ... lines.length - 1
		
		// 3. build edges by iterating over lines 
		//      i = 0 ... lines.length - 1
		//    a. string line = lines[i]
		//    b. string[] words = line.split()
		//    c. vertex v1 = words[0]
		//    d. int N = (words.length - 1)/2
		//    e. for k = 0 ... N
		//       vertex v2 = Graph.getVertex(word[k * 2])
		//       weight w = words[k * 2 +1]
		//       edge e = new Edge(v1,v2,w) 
		//       v1.add(e), v2.add(e)
	}
}
