package in.interview.amazon;

import java.lang.reflect.Array;
import java.util.LinkedList;

/**
 * Adjacency list data structure.
 * 
 * @author kuldeep
 * @param <E>
 */
public abstract class AdjacencyList<E> {

	/**
	 * All vertices in graph
	 */
	private Vertex<E>[] vertices;
	
	@SuppressWarnings("unchecked")
	public <T> AdjacencyList(Class<E> c, int verticesCount) {
		super();
		this.vertices = (Vertex<E>[]) Array.newInstance(c, verticesCount);
	}

	/**
	 * Add an edge from start to end
	 * @param start
	 * 			start vertex of the edge
	 * @param end
	 * 			end vertex of the edge.
	 */
	public void addEdge(int start, int end) {
		vertices[start].addEdge(end);
	}
	
	/**
	 * @param i
	 * 		vertex, index of vertex in adjacency list.
	 * @return	adjacent nodes to given vertex
	 */
	public LinkedList<Integer> getAdjacentVertices(int i) {
		return vertices[i].getAdjacentNodes();
	}
	
	/**
	 * A vertex in adjacency list representation of graph.
	 * 
	 * @author kuldeep
	 *
	 * @param <T>
	 */
	public class Vertex<T> {
		
		/**
		 * Data stored in graph node
		 */
		private T data;
		
		/**
		 * Nodes adjacent to the concerned vertex
		 */
		private LinkedList<Integer> adjacentNodes;

		public Vertex() {
			super();
			this.adjacentNodes = new LinkedList<Integer>();
		}
		
		public Vertex(T data) {
			this();
			this.data = data;
		}

		/**
		 * @return the data
		 */
		public T getData() {
			return data;
		}

		/**
		 * @return the adjacentNodes
		 */
		public LinkedList<Integer> getAdjacentNodes() {
			return adjacentNodes;
		}
		
		/**
		 * Add an edge from this vertex to given vertex.
		 * 
		 * @param end
		 * 		end node of the edge
		 */
		public void addEdge(int end) {
			adjacentNodes.add(end);
		}
	}
	
}
