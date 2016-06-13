package com.sui.datastructures.graph;

import java.util.LinkedList;
import java.util.Scanner;

public class SimpleGraph {

	int V;
	int E;
	LinkedList<Integer> adjList[];

	public SimpleGraph(int V) {
		this.V = V;
		this.E = 0;
		adjList = (LinkedList<Integer>[]) new LinkedList[V];
		for (int i = 0; i < V; i++) {
			adjList[i] = new LinkedList<Integer>();
		}
	}

	public SimpleGraph(Scanner in) {
		this(in.nextInt());
		int E = in.nextInt();
		for (int i = 0; i < E; i++) {
			int v = in.nextInt();
			int w = in.nextInt();
			addEdge(v, w);
		}
	}

	public int V() {
		return V;
	}

	public int E() {
		return E;
	}

	public void addEdge(int v, int w) {
		adjList[v].add(w);
		adjList[w].add(v);
		this.E++;
	}

	public LinkedList<Integer> getEdges(int V) {
		return adjList[V];
	}
	
	@Override
	public String toString() {
		String graphstr = "";
		int i = 0;
		for(LinkedList<Integer> list:adjList){
			graphstr +="["+i+"]";
			for(Integer v:list){
				graphstr +="->"+v;	
			}
			graphstr+=System.lineSeparator();
			i++;
		}
		return graphstr;
	}

}
