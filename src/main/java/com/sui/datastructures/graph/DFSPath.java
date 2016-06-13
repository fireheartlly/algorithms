package com.sui.datastructures.graph;

import java.util.LinkedList;

import com.sui.datastructures.Stack;

public class DFSPath implements Path {
	boolean visited[];
	int edgesTo[];
	int source;
	public void Path(SimpleGraph G, int S) throws Exception{
		visited = new boolean[G.V];
		edgesTo = new int[G.V];
		source = S;
		DFS(G,S);
	}

	private void DFS(SimpleGraph g, int s) {
		visited[s] = true;
		for(int w:g.getEdges(s)){
			if(!visited[w]){
				edgesTo[w] = s;
				DFS(g,w);
			}
		}
	}

	public boolean hasPath(int v) {
		return visited[v];
	}

	public Iterable<Integer> pathTo(int v) throws Exception {
		if(!hasPath(v)) return null;
		Stack<Integer> stack = new Stack<Integer>();
		int val = v;
		while(val!=source){
			stack.push(val);
			val = edgesTo[val];
			
		}
		stack.push(source);
		LinkedList<Integer> list = new LinkedList<Integer>();
		while(!stack.isEmpty()){
			list.add(stack.pop());
		}
		return list;
	}

}
