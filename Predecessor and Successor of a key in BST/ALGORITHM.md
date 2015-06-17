Inorder Predecessor and Successor of a Key in BST
=================================================

<h3>
Statement :
</h3>
Find predecessor and successor of a key in inorder of BST.

<h4>
Algorithm :
</h4>
Search key in tree. For successor find leftmost node of it's(key's) right subtree. For predecessor look for rightmost node of it's left subtree.

<h4>
Complexity :
</h4>
Time : To search key O(log(n)) + To find predecessor O(log(n)) = O(log(n)) <br>
Space : O(1)