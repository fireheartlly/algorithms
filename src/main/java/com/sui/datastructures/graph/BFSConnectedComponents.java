package com.sui.datastructures.graph;

import com.sui.datastructures.Queue;

public class BFSConnectedComponents implements CC {
	boolean[] visited;
	int[] ids;
	int count = 0;
	
	public BFSConnectedComponents(SimpleGraph G) throws Exception{
		visited = new boolean[G.V];
		ids = new int[G.V];
		for(int i=0;i<G.V;i++){
			if(!visited[i]){
				BFS(G,i);
				count++;	
			}
		}
	}

	private void BFS(SimpleGraph g, int i) throws Exception{
		Queue<Integer> queue = new Queue<Integer>();
		visited[i] = true;
		queue.enQueue(i);
		ids[i] = count;
		while(!queue.isEmpty()){
			int val = queue.deQueue();
			for(int w:g.getEdges(val)){
				if(!visited[w]){
					ids[w] = count;
					visited[w] = true;
					queue.enQueue(w);	
				}
			}
		}
	}

	public boolean isConnected(int u, int v) {
		return ids[u] == ids[v];
	}

	public int id(int v) {
		return ids[v];
	}

	public int count() {
		return count;
	}

}
