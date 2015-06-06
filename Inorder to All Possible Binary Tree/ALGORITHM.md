Make all possible Binary Tree from given Inorder
================================================

<h3>
Statement :
</h3>
Make all possible unique binary trees which will give the concerned inorder.

<h4>
Algorithm :
</h4>
<p> Lets say inorder is x<sub>1</sub>, x<sub>2</sub>, x<sub>3</sub>, ...  x<sub>k</sub>, x<sub>k+1</sub>, ...  x<sub>n</sub>.
We have all the Binary Tree which give inorder for first 'k' elements.  x<sub>k+1</sub> can be inserted in all these binary trees maintaining the inorder up to 'k+1'th element.</p> T<sub>1</sub>, T<sub>2</sub>, ... T<sub>p</sub> are all subtrees which give inorder up to k. For each T<sub>i</sub>,<br>
<ol>
<li> Append T<sub>i</sub> to the left of x<sub>k+1</sub>. New tree have inorder up to k+1 elements. </li>
<li> T<sub>i</sub> have L<sub>i</sub> and R<sub>i</sub> left and right child sub trees. x<sub>k+1</sub> can be inserted recursively in R<sub>i</sub>.
	<ul>
		<li> Get all possible subtrees after inserting x<sub>k+1</sub> in R<sub>i</sub> maintaining the required inorder </li>
		<li> Now, each new subtree can be placed in place of R<sub>i</sub> in T<sub>i</sub>
	</ul>
</li>
</ol>

<h4> 
Complexity :
</h4>
Time : 