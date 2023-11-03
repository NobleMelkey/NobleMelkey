package Data_structure;

import java.io.*;
import java.util.*;

class Undirected_cyclic_graph {

	
	private int V;

	
	private LinkedList<Integer> adj[];

	
	Undirected_cyclic_graph(int v)
	{
		V = v;
		adj = new LinkedList[v];
		for (int i = 0; i < v; ++i)
			adj[i] = new LinkedList();
	}

	
	void addEdge(int v, int w)
	{
		adj[v].add(w);
		adj[w].add(v);
	}

	
	Boolean isCyclicUtil(int v, Boolean visited[],
						int parent)
	{
		
		visited[v] = true;
		Integer i;

		
		Iterator<Integer> it = adj[v].iterator();
		while (it.hasNext()) {
			i = it.next();

			
			if (!visited[i]) {
				if (isCyclicUtil(i, visited, v))
					return true;
			}

			
			else if (i != parent)
				return true;
		}
		return false;
	}

	
	Boolean isCyclic()
	{

		
		Boolean visited[] = new Boolean[V];
		for (int i = 0; i < V; i++)
			visited[i] = false;

		
	
		for (int u = 0; u < V; u++) {

			// Don't recur for u if already visited
			if (!visited[u])
				if (isCyclicUtil(u, visited, -1))
					return true;
		}

		return false;
	}

	
	public static void main(String args[])
	{

	
		Undirected_cyclic_graph g1 = new Undirected_cyclic_graph(5);
		g1.addEdge(1, 0);
		g1.addEdge(0, 2);
		g1.addEdge(2, 1);
		g1.addEdge(0, 3);
		g1.addEdge(3, 4);
		if (g1.isCyclic())
			System.out.println("Graph contains cycle");
		else
			System.out.println("Graph doesn't contain cycle");

		Undirected_cyclic_graph g2 = new Undirected_cyclic_graph(3);
		g2.addEdge(0, 1);
		g2.addEdge(1, 2);
		if (g2.isCyclic())
			System.out.println("Graph contains cycle");
		else
			System.out.println("Graph doesn't contain cycle");
	}
}

