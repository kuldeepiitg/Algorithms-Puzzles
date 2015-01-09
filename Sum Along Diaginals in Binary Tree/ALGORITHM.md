Sum along Left Diagonals
=======================

<h3>
Statement :
</h3>
Consider lines of slope -1 passing between nodes (dotted lines in below diagram). 
Diagonal sum in a binary tree is sum of all node’s data lying between these lines. 
Given a Binary Tree, print all diagonal sums.
http://www.geeksforgeeks.org/diagonal-sum-binary-tree/

<h4>
Algorithm :
</h4>
Use two queues. First queue will hold elements along diagonals and second queue
will hold their right neighbors. Then process second queue considering as diagonal.


<h4>
Complexity :
</h4>
Time : O(n) <br>
Space : O(n), <br>
		O(log(n)) for balanced tree.