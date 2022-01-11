package Graph;
import java.util.*;
public class CycleInUndirected {
	static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) 
	{ 
		adj.get(u).add(v); 
		adj.get(v).add(u); 
	} 
	static boolean DFSRec(ArrayList<ArrayList<Integer>> adj,int s, boolean[] vis, int parent) 
	{ 
		vis[s]=true;
		
		for(int i=0;i<adj.get(s).size();i++)
		{
			if(vis[i]!=true)
			{
				if(DFSRec(adj,i,vis,i)==true)
				{
					return true;
				}
			}
			else if(i!=parent)
			{
				return true;
			}
		}
		
		return false;
	}
	
	static boolean DFS(ArrayList<ArrayList<Integer>> adj, int V){
		boolean vis[]=new boolean[V];
		for(int i=0;i<V;i++)
		{
			vis[i]=false;
		}
		for(int i=0;i<V;i++)
		{
			if(vis[i]!=true)
			{
				if(DFSRec(adj,i,vis,-1)==true)
					return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) 
	{  
		int V = 6; 
		ArrayList<ArrayList<Integer> > adj = new ArrayList<ArrayList<Integer>>(V); 
		
		for (int i = 0; i < V; i++) 
			adj.add(new ArrayList<Integer>()); 

			addEdge(adj,0,1); 
        	addEdge(adj,1,2); 
        	addEdge(adj,2,4); 
        	addEdge(adj,4,5); 
        	addEdge(adj,1,3);
        	addEdge(adj,2,3);
		
		if(DFS(adj,V)==true)
    	    System.out.println("Cycle found");
    	else
    	    System.out.println("No cycle found");
	} 
}
