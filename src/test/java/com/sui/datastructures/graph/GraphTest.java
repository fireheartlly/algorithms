package com.sui.datastructures.graph;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.junit.Test;

import junit.framework.TestCase;

public class GraphTest extends TestCase {

	@Test
	public void testCreateGraph() throws FileNotFoundException {
		ClassLoader classLoader = getClass().getClassLoader();
		File file = new File(classLoader.getResource("tinyG.txt").getFile());

		// File file = new File("tinyG.txt");
		Scanner in = new Scanner(file);
		SimpleGraph graph = new SimpleGraph(in);
		// System.out.println(graph);
	}

	public void testDFSearch() throws Exception {
		ClassLoader classLoader = getClass().getClassLoader();
		File file = new File(classLoader.getResource("tinyG.txt").getFile());

		// File file = new File("tinyG.txt");
		Scanner in = new Scanner(file);
		SimpleGraph graph = new SimpleGraph(in);
		DFSearch dfs = new DFSearch();
		dfs.search(graph, 10);
		System.out.println("");

	}

	public void testBFS() throws Exception {
		ClassLoader classLoader = getClass().getClassLoader();
		File file = new File(classLoader.getResource("tinyG.txt").getFile());

		// File file = new File("tinyG.txt");
		Scanner in = new Scanner(file);
		SimpleGraph graph = new SimpleGraph(in);
		BFSearch bfs = new BFSearch();
		bfs.search(graph, 1);
		System.out.println("");

	}

	public void testHasPathUsingDFS() throws Exception {
		ClassLoader classLoader = getClass().getClassLoader();
		File file = new File(classLoader.getResource("tinyG.txt").getFile());

		// File file = new File("tinyG.txt");
		Scanner in = new Scanner(file);
		SimpleGraph graph = new SimpleGraph(in);
		Path path = new DFSPath();
		path.Path(graph, 0);
		assertFalse(path.hasPath(8));
		assertTrue(path.hasPath(4));
		//assertEquals("[0, 5, 4]",path.pathTo(4));
	}

	public void testHasPathUsingBFS() throws Exception {
		ClassLoader classLoader = getClass().getClassLoader();
		File file = new File(classLoader.getResource("tinyG.txt").getFile());

		// File file = new File("tinyG.txt");
		Scanner in = new Scanner(file);
		SimpleGraph graph = new SimpleGraph(in);
		Path path = new BFSPath();
		path.Path(graph, 0);
		assertFalse(path.hasPath(8));
		assertTrue(path.hasPath(4));
		//assertEquals("[0, 5, 4]",path.pathTo(4));
	}

	public void testPathFromAllUsingDFS() throws Exception {
		ClassLoader classLoader = getClass().getClassLoader();
		File file = new File(classLoader.getResource("tinyG.txt").getFile());

		// File file = new File("tinyG.txt");
		Scanner in = new Scanner(file);
		SimpleGraph G = new SimpleGraph(in);
		Path search = new DFSPath();
		int s = 0;
		search.Path(G, s);
		/*
		for (int v = 0; v < G.V(); v++) {
			System.out.print(s + " to " + v + ": ");
			if (search.hasPath(v))
				for (int x : search.pathTo(v))
					if (x == s)
						System.out.print(x);
					else
						System.out.print("-" + x);
			System.out.println();
		}
		*/
	}
	
	
	public void testFindConnectedComponentsUsingDFS() throws Exception {
		//System.out.println("Finding Connected components using DFS");
		ClassLoader classLoader = getClass().getClassLoader();
		File file = new File(classLoader.getResource("tinyG.txt").getFile());
		Scanner in = new Scanner(file);
		SimpleGraph G = new SimpleGraph(in);
		CC conc = new DFSConnectedComponents(G);
		assertEquals(3,conc.count());
		assertTrue(conc.isConnected(10,11));
		assertFalse(conc.isConnected(10,0));
		assertFalse(conc.isConnected(1,8));
	}
	
	public void testFindConnectedComponentsUsingBFS() throws Exception {
		//System.out.println("Finding Connected components using DFS");
		ClassLoader classLoader = getClass().getClassLoader();
		File file = new File(classLoader.getResource("tinyG.txt").getFile());
		Scanner in = new Scanner(file);
		SimpleGraph G = new SimpleGraph(in);
		CC conc = new BFSConnectedComponents(G);
		assertEquals(3,conc.count());
		assertTrue(conc.isConnected(10,11));
		assertFalse(conc.isConnected(10,0));
		assertFalse(conc.isConnected(1,8));
	}
	
}
