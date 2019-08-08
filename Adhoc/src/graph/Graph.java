package graph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Graph {
	private int V;
	private LinkedList<Integer> adj[];

	public Graph(int n) {
		// TODO Auto-generated constructor stub
		V=n;
		adj=new LinkedList[n];
		for (int i=0; i<n; ++i)
			adj[i] = new LinkedList();
	}

	void addEdge(int v,int w)
	{
		adj[v].add(w);
	}

	void dfsTraverse(int start)
	{
		boolean[] visited= new boolean[V];
		/*for (int i=0; i<V; ++i)
		{
			if (visited[i] == false)
				dfsTraverse(i, visited);
		}*/
		dfs(start,visited);
	}
	private void dfs(int start, boolean[] visited) {
		
		Stack<Integer> st = new Stack<>();
		st.push(start);
		visited[start]=true;
		while(!st.isEmpty())
		{
			start=st.pop();
			System.out.println(start+" ");
			Iterator<Integer>it=adj[start].iterator();
			while(it.hasNext())
			{
				int n=it.next();
				if(!visited[n])
				{
					visited[n]=true;
					st.push(n);
				}
			}
		}
	}

	void bfsTraverse(int start)
	{
		boolean visited[]= new boolean[V];
		Queue<Integer> queue = new LinkedList<Integer>();
		visited[start]=true;
		queue.add(start);
		while(!queue.isEmpty())
		{
			start=queue.poll();
			System.out.println(start+" ");

			Iterator<Integer>it=adj[start].iterator();
			while(it.hasNext())
			{
				int n=it.next();
				if(!visited[n])
				{
					visited[n]=true;
					queue.add(n);
				}
			}
		}
	}

	/*void dfs()
	{
		boolean[] visited= new boolean[V];
		for (int i=0; i<V; ++i)
		{
			if (visited[i] == false)
				dfsTraverse(i, visited);
		}
	}
	private void dfsTraverse(int start, boolean [] visited)
	{
		visited[start]=true;
		System.out.println(start+"");
		Iterator<Integer> it= adj[start].iterator();
		while(it.hasNext())
		{
			int n =it.next();
			if(!visited[n])
				dfsTraverse(n, visited);
		}
	}*/
}
