package in.kuldeepyadav.amazon.interview;

import in.kuldeepyadav.google.interview.Node;

import java.util.Comparator;
import java.util.Map;

import org.junit.Test;

/**
 * Junit test for {@link FloorCeilingBST}.
 * 
 * @author kuldeep
 *
 */
public class FloorCeilingBSTTest {

	@Test
	public void testGetFloorCeiling() {
		
		FloorCeilingBST<Integer> binarySearchTree = new FloorCeilingBST<Integer>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1-o2;
			}
		});
		
		binarySearchTree.insert(8,4,13,2,6,10,15,1,3,5,7,9,12,14,16);
		Map<String, Node<Integer>> floorCelining = binarySearchTree.getFloorCeiling(11);
		System.out.println(floorCelining.get("floor").getValue());
		System.out.println(floorCelining.get("ceiling").getValue());
	}

}
