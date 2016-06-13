package com.sui.datastructures.graph;

import com.sui.datastructures.Stack;

public class TwoColorable {
	boolean[] visited;
	boolean[] colors;
	boolean isTwoColorable = true;

	public TwoColorable(SimpleGraph G) throws Exception {
		visited = new boolean[G.V];
		colors = new boolean[G.V];
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
					colors[w] = !colors[val];
					stack.push(w);
				}
				else if(colors[w]==colors[val]){
					isTwoColorable = false;
				}
			}
		}
	}

	public boolean isTwoColorable(){
		return isTwoColorable;
	}
	

}
