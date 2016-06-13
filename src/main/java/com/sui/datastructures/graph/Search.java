package com.sui.datastructures.graph;

public interface Search {
	public void search(SimpleGraph G,int s) throws Exception;
	public boolean marked(int v);
	public int count();
}
