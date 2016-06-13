package com.sui.datastructures.graph;

import java.util.LinkedList;

import com.sui.datastructures.Queue;
import com.sui.datastructures.Stack;

public class BFSPath implements Path {
	boolean visited[];
	int source;
	int edgeTo[];
	
	public void Path(SimpleGraph G, int S) throws Exception{
		this.source = S;
		visited = new boolean[G.V];
		edgeTo = new int[G.V];
		BFS(G,S);
	}

	private void BFS(SimpleGraph g, int s) throws Exception{
		Queue<Integer> queue = new Queue<Integer>();
		queue.enQueue(s);
		visited[s] = true;
		while(!queue.isEmpty()){
			s = queue.deQueue();
			for(int w: g.getEdges(s)){
				if(!visited[w]){
					queue.enQueue(w);
					edgeTo[w] = s;
					visited[w] = true;
				}
			}
		}
	}

	public boolean hasPath(int v) {
		return visited[v];
	}

	public Iterable<Integer> pathTo(int v) throws Exception {
		Stack<Integer> stack = new Stack<Integer>();
		int val = v;
		while(val!=source){
			stack.push(val);
			val = edgeTo[val];
		}
		stack.push(source);
		LinkedList<Integer> list = new LinkedList<Integer>();
		while(!stack.isEmpty()){
			list.add(stack.pop());
		}
		return list;
	}
}
