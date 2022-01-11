package Graph;
import java.util.*;
public class Bfs {
	static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) 
	{ 
		adj.get(u).add(v); 
		adj.get(v).add(u); 
	} 
	
	private static void BFS(ArrayList<ArrayList<Integer>> adj, int s, boolean[] vis) {
		Queue<Integer> q=new LinkedList<Integer>();
		vis[s]=true;
		q.add(s);
		while(q.isEmpty()!=true)
		{
			int l=q.poll();
			for(int v:adj.get(l))
			{
				if(vis[v]==false)
				{
					vis[v]=true;
					q.add(v);
				}
			}
		}
		
	}

	
	
	private static Integer BFSDin(ArrayList<ArrayList<Integer>> adj, int v) {
		int count =0;
		boolean vis[]=new boolean[7];
		for(int i=0;i<7;i++)
		{
			vis[i]=false;
		}
		for(int i=0;i<7;i++)
		{
			if(vis[i]==false)
			{
				BFS(adj,i,vis);
				count++;
			}
		}
		return count;
	} 
	
	
	
	
	
	
	
	


	public static void main(String[] args) 
	{  
		int V = 7; 
		ArrayList<ArrayList<Integer> > adj = new ArrayList<ArrayList<Integer>>(V); 
		
		for (int i = 0; i < V; i++) 
			adj.add(new ArrayList<Integer>()); 

			addEdge(adj,0,1); 
        	addEdge(adj,0,2); 
        	addEdge(adj,2,3); 
        	addEdge(adj,1,3); 
        	addEdge(adj,4,5);
        	addEdge(adj,5,6);
        	addEdge(adj,4,6);
		
		System.out.print("Number of islands: "+BFSDin(adj,V)); 
	}

	
}
