package com.sui.datastructures.graph;

import com.sui.datastructures.Stack;

public class DFSearch implements Search {

	boolean[] visited;
	int count = 0;
	
	public void search(SimpleGraph G, int s) throws Exception {
		visited = new boolean[G.V];
		DFS(G,s);
		System.out.println("");
		for(int i=0;i<G.V;i++){
			if(!visited[i]){
				DFS(G,i);
				System.out.println("");
			}
		}
	}

	private void DFS(SimpleGraph G,int s) throws Exception{
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(s);
		visited[s] = true;
		while(!stack.isEmpty()){
			int v = stack.pop();
			System.out.print(v+"->");
			count++;
			for(Integer w:G.getEdges(v)){
				if(!visited[w]){
					visited[w] = true;
					stack.push(w);	
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
