package graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class GraphMatrix {

	private int maxVertex;
	int [][] adjMatrix;
	boolean[] visited;
	public GraphMatrix(int n) 
	{
		maxVertex=n;
		adjMatrix= new int[maxVertex][maxVertex];
	}

	public void addEdge(int v,int w)
	{
		adjMatrix[v][w]=1;
	}
	public void removeEdge(int v,int w)
	{
		adjMatrix[v][w]=0;
	}
	public int hasEdge(int v,int w)
	{
		if(v>maxVertex || w>maxVertex)
			return -1;
		else
			return adjMatrix[v][w];
	}

	public void dispMatrix()
	{
		for(int i=0;i<maxVertex;i++)
		{
			for(int j=0;j<maxVertex;j++)
			{
				System.out.print(adjMatrix[i][j]);
			}
			System.out.println();
		}
	}

	public void bfs(int start)
	{
		visited= new boolean[maxVertex];
		Queue<Integer> q= new LinkedList<>();
		q.add(start);
		while(!q.isEmpty())
		{
			start=q.remove();
			if(!visited[start])
			{
				visited[start]=true;
				System.out.println(start+" ");
			}
			q=getAllAdjacentUnvisited(start,q);
		}
	}



	private Queue<Integer> getAllAdjacentUnvisited(int start, Queue<Integer> q) {
		// TODO Auto-generated method stub
		for(int i=0;i<maxVertex;i++)
		{
			if(hasEdge(start, i)==1 && visited[i]==false)
				q.add(i);
		}
		return q;
	}

	public void dfs(int start)
	{
		visited= new boolean[maxVertex];
		Stack<Integer> st = new Stack<>();
		visited[start]=true;
		st.push(start);
		while(!st.isEmpty())
		{
			start=st.pop();
			System.out.println(start+" ");
			int u=getAdjacentUnvisited(start);
			if(u!=-1)
			{
				visited[u]=true;
				st.push(u);
			}
		}
	}
	

	public boolean hasSimplePath(int s,int d)
	{
		visited= new boolean[maxVertex];
		int u=SimplePath(visited,s, d);
		if(u==1)
			return true;
		else
			return false;
	}
	private int SimplePath(boolean []visited,int s,int d)
	{

		visited[s]=true;
		if(s==d)
		{
			return 1;
		}
		for(int i=0;i<maxVertex;i++)
		{
			int t=getAdjacentUnvisited(s);
			if(t!=-1)
				if (SimplePath(visited,t, d)==1)
					return 1;
		}
		return 0;
	}

	public void getAllSimplePaths(int s,int d)
	{
		visited= new boolean[maxVertex];
		String a="";
		int count=0;
		printSimplePath(visited,s,d,count,a);

	}

	private void printSimplePath(boolean[] visited, int s, int d, int count,String a) {

		if(s==d)
		{
			count++;
			//System.out.println(a);
			visited[s]=true;
		}
		for(int i=0;i<maxVertex;i++)
		{
			int t=getAdjacentUnvisited(s);
			if(t!=-1)
			{
			/*	a=a.concat("-->");
				String b=Integer.toString(t);
				a=a.concat(b);*/
				//a=a+"-->"+Integer.toString(t);
				visited[t]=true;
				printSimplePath(visited, t, d, count, a);
				
			}
		}
		System.out.println(count);
	}

	private int getAdjacentUnvisited(int start) {
		for(int i=0;i<maxVertex;i++)
			if(hasEdge(start, i)==1 && visited[i]==false)
				return i;
		return -1;
	}

	public static void main(String[] args) {

		GraphMatrix g= new GraphMatrix(4);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		g.addEdge(2, 0);
		g.addEdge(2, 3);
		g.addEdge(3, 3);
		g.dispMatrix();
		//g.getAllSimplePaths(0, 3);
		//g.bfs(2);
		boolean flag=g.hasSimplePath(3, 2);
		System.out.println(flag);
	}
}
