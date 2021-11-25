import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class GraphDFSBFS {

	// create a node class
	// create a dfs algo
	// create a BFS algo
	private HashMap<Integer, Node> lookup = new HashMap<Integer, Node>();

	public static class Node {
		private int id;
		LinkedList<Node> adjacent = new LinkedList<Node>();

		private Node(int id) {
			this.id = id;
		}

	}

	private Node getNode(int id) {
        
		return null;

	}

	private void addEdge(int source, int destination) {
		Node s = getNode(source);
		Node d = getNode(destination);
		s.adjacent.add(d);

	}

	public boolean hasPathDFS(int source, int destination) {
		Node s = getNode(source);
		Node d = getNode(destination);
		HashSet<Integer> set = new HashSet<Integer>();
		return hasPathDFS(s, d, set);
	}

	public boolean hasPathDFS(Node s, Node d, HashSet<Integer> visited) {
		if (visited.contains(s.id)) {
			return false;
		}
		visited.add(s.id);
		if (s == d) {
			return true;
		}
		for (Node n : s.adjacent) {
			if (hasPathDFS(n, d, visited)) {
				return true;
			}
		}

		return false;
	}
	public boolean hasBFS(Node source,Node destination)
	{
		LinkedList<Node> nextToVisit=new LinkedList<Node>();
		HashSet<Integer> visited=new HashSet<Integer>();
		nextToVisit.add(source);
		while(!nextToVisit.isEmpty())
		{
			Node node=nextToVisit.remove();
			if(node==destination)
			{
				return true;
			}
			if(visited.contains(node.id))
			{
				continue;
			}
			visited.add(node.id);
			for(Node child:node.adjacent)
			{
				nextToVisit.add(child);
			}
		}
		return false;
	}
}
