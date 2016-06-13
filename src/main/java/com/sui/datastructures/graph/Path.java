package com.sui.datastructures.graph;

public interface Path {
	
	public void Path(SimpleGraph G,int S) throws Exception;
	public boolean hasPath(int v);
	Iterable<Integer> pathTo(int v) throws Exception;
}
