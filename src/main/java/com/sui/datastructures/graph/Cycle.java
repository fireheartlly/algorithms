package com.sui.datastructures.graph;

import com.sui.datastructures.Stack;

public class Cycle {
	boolean[] visited;
	boolean hasCycle = false;
	
	public Cycle(SimpleGraph G) throws Exception{
		visited = new boolean[G.V];
		for(int i=0;i<G.V;i++){
			DFS(G,i);
		}
	}

	private void DFS(SimpleGraph g, int i) throws Exception{
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(i);
		visited[i] = true;
		while(!stack.isEmpty()){
			int val = stack.pop();
			for(int w:g.getEdges(val)){
				if(!visited[w]){
					visited[w] = true;
					stack.push(w);
				}
				else if(w==val){
					hasCycle = true;
				}
			}
		}
	}

	public boolean hasCycle(){
		return hasCycle;
	}
}
