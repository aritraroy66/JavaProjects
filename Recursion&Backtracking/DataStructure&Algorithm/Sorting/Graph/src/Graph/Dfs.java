package Graph;
import java.util.*;
public class Dfs {
	static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) 
	{ 
		adj.get(u).add(v); 
		adj.get(v).add(u); 
	} 
	
	private static void DFSRec(ArrayList<ArrayList<Integer>> adj, int s, int v,boolean[] vis) {
		vis[s]=true;
		for(int l:adj.get(s))
		{
			if(vis[l]!=true)
			{
				vis[l]=true;
				DFSRec(adj,l,v,vis);
			}
		}
		
	}

	
	
	private static Integer DFS(ArrayList<ArrayList<Integer>> adj, int v) {
		boolean vis[]=new boolean[v];
		int count=0;
		for(int i=0;i<v;i++)
		{
			vis[i]=false;
		}
		for(int i=0;i<v;i++)
		{
			if(vis[i]!=true)
			{
				count++;
				DFSRec(adj,i,v,vis);
				
			}
		}
		
		return count;
	} 
	
	
	
	



	public static void main(String[] args) 
	{  
		int V = 5; 
		ArrayList<ArrayList<Integer> > adj = new ArrayList<ArrayList<Integer>>(V); 
		
		for (int i = 0; i < V; i++) 
			adj.add(new ArrayList<Integer>()); 

			addEdge(adj,0,1); 
        	addEdge(adj,0,2); 
        	addEdge(adj,1,2);
        	addEdge(adj,3,4);
		
		System.out.println("Number of connected components: "+DFS(adj,V));
	}
	
}
