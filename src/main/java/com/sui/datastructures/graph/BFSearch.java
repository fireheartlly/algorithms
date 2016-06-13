package com.sui.datastructures.graph;

import com.sui.datastructures.Queue;

public class BFSearch implements Search{
	boolean visited[];
	int count = 0;
	
	public BFSearch() {
		
	}
	
	public void search(SimpleGraph G, int s) throws Exception {
		visited = new boolean[G.V];
		BFS(G,s);
		System.out.println("");
		for(int i=0;i<G.V;i++){
			if(!visited[i]){
				BFS(G,i);
				System.out.println("");
			}
		}
	}
	
	private void BFS(SimpleGraph G,int s) throws Exception{
		Queue<Integer> queue = new Queue<Integer>();
		visited[s] = true;
		queue.enQueue(s);
		while(!queue.isEmpty()){
			int v = queue.deQueue();
			System.out.print(v+"->");
			count++;
			for(int w:G.getEdges(v)){
				if(!visited[w]){
					queue.enQueue(w);
					visited[w] = true;
				}
			}
		}
	}

	public boolean marked(int v) {
		return visited[v];
	}

	public int count() {
		return count;
	}

}
