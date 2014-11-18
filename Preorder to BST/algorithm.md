Preorder to Binary Search Tree(BST)
==============================

<h3>Problem statement: Given a preorder of a BST, can we get back the original tree?
If yes, then write an algorithm.</h3>

<h4>Algorithm 1 pseudo code:</h4>
1. Divide and rule. Pick first element from preorder, that will be root of BST.

2. For the picked root in hand,
  
  2.1 If size of array in hand is 1 then return single node tree. 
  
  2.2 Otherwise,

    2.2.1 Iterate over array to pick elements next to root to find subarray of all elements which are <i>smaller</i> than the root if any. Similarly, pick elements which are <i>larger</i> than root which must be following subarray of <i>smaller</i> elements.
  
    2.2.2 For <i>smaller</i> subarray repeat step 2, it will give left subtree to root in hand. Similarly <i>larger</i> subarray will give right subtree.
  
<h5>Time and Space:</h5>
Time: T(n) = 2T(n/2) + O(n) 
      <br>T(n) = O(n*log(n))
Space: O(1)

<h6>Note:</h6> 
Small Improvement can lead to further reduction in time complexity. While finding <i>smaller</i> and <i>larger</i> subarray, don't traverse whole array but go for jumps like in Binary Search. It will reduce single step time from O(n) to O(log(n)). And this can be done because all elements smaller than roots are before larger elements.


<h4>Algorithm 2 :</h4> 

Reverse the preorder traversal to get back the BST.
1. Initialize root pointing node having last value. 
2. Iterate preorder in reverse order.
    2.1 If next node is smaller than root then make the right of new node point to current subtree. And make the new node root child of tree.
    2.2 If next node is larger than root then go on traversing rightmost series of edges and stop at the first node which is larger than next node. That means the found node and all its children are smaller than the next node. Also  all skiped nodes and their left children are smaller than next node. Make larger subtree as right child of new node and skipped one as left subtree. Take new node as root. Refer to image.

![alt tag](https://github.com/kuldeepiitg/Google-Interviews/tree/master/Preorder\ to\ BST/images/PreorderTOBST.jpg)