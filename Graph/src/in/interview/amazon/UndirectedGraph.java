package in.interview.amazon;

/**
 * Undirected Graph
 * 
 * @author kuldeep
 *
 * @param <E>
 */
public class UndirectedGraph<E> extends DirectedGraph<E>{

	public UndirectedGraph(Class<E> c, int verticesCount) {
		super(c, verticesCount);
	}

	@Override
	public void addEdge(int start, int end) {
		super.addEdge(start, end);
		super.addEdge(end, start);
	}
	
}
