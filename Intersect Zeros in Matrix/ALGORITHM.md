Intersect Zeros in Matrix with Minimum Lines
============================================

<h3>
Statement :
</h3>
Given an matrix with m rows and n columns containing only 0's and 1's.
Count how many minimum lines are required to cut all zeros such that a line is either 
row wise or column wise.

<h4>
Aldorithm :
</h4>
Use greedy approach. Find the row or column which have maximum number of 0s. Cut it with line and repeat
procedure for remaining smaller matrix.

<h4>
Pseudo Code :
</h4>
```
1. Iterate over whole matrix and count number of zeros in each row and column.
2. Find row/column which have maximum zeros.
	2.1 Let's say it is ith row, so iterate over it and decrease zeros count for columns if there is
	some zero in that row in the corresponding column.
	2.2 Now consider remaining matrix and repeat step 2 until we are left with all rows having no zero.
	
``` 

<h4>
Complexity :
</h4>
Time: O(m\*n) + O(m+n)\*m = O(m+n)\*(m)	where m is smaller than n.
<br>
Space: O(m\*n)