Alphabet Order
==============

<h3>
Statement :
</h3>
Set of strings are given in a dictionary order. 
The problem here is order is not as our alphabetical. 
It may be different. 
C may come before a,b, x may come before d,c. etc. 
You will have to find the order of characters by using given input. 

<h4>
Algorithm :
</h4>
Make directed graph which will have characters as nodes.
If dictionary contains two consecutive words as aaaax,aaaay
then there will be an edge directed from <b>x</b> to <b>y</b>.
Now apply topological sort to get the order.

<h4>
Complexity :
</h4>
Time : O(n) + O(V) + O(E), where n is number of characters in whole dictionary.
		V is size of alphabet and E are number of edges in the graph. <br>
		|V| << n, <br>
		|E| < n, <br>
		so time : O(n)
		<br>
Space : |V| + |E|

