package com.sui.datastructures.graph;

import com.sui.datastructures.Stack;

public class DFSConnectedComponents implements CC {
	boolean[] visited;
	int[] ids;
	int count = 0;
	
	public DFSConnectedComponents(SimpleGraph G) throws Exception{
		visited = new boolean[G.V];
		ids = new int[G.V];
		for(int i=0;i<G.V;i++){
			if(!visited[i]){
				DFS(G,i);
				count++;
			}
		}
	}

	private void DFS(SimpleGraph g, int i) throws Exception{
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(i);
		visited[i] = true;
		ids[i] = count;
		while(!stack.isEmpty()){
			int val = stack.pop();
			for(int w:g.getEdges(val)){
				if(!visited[w]){
					stack.push(w);
					ids[w] = count;
					visited[w] = true;
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
