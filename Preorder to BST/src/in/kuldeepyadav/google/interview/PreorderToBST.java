package in.kuldeepyadav.google.interview;

/**
 * Reverse the preorder traversal to get back the BST.
 * 1. Initialize root pointing node having last value. 
 * 2. Iterate preorder in reverse order. 
 * 	2.1 If next node is smaller than root then make the right of new node point to current subtree.
 * 		And make the new node root child of tree.
 * 
 * 2.2 If next node is larger than root then go on traversing rightmost series of edges and stop 
 * 		at the first node which is larger than next node. That means the found node and all its children 
 * 		are smaller than the next node. Also  all skiped nodes and their left children are smaller than 
 * 		next node. Make larger subtree as right child of new node and skipped one as left subtree. Take 
 * 		new node as root.
 * 
 * @author kuldeep
 */
public class PreorderToBST {

}
