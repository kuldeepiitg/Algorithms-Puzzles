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
Use greedy approach. Find the row or column which have maximum number of 0s. 
Cut it with line and repeat
procedure for remaining smaller matrix.

<h4>
Pseudo Code :
</h4>
```
1. Iterate over whole matrix and count number of zeros in each row and column.
2. Find row/column which have maximum zeros.
	2.1 Let's say it is ith row, so iterate over it and decrease zeros count for columns 
		if there is some zero in that row in the corresponding column.
	2.2 Now consider remaining matrix and repeat step 2 until we are left with all rows 
		having no zero.
	
``` 

<h4>
Proof of Correctness :
</h4>
Greedy Choice : Every time I choose row/column having maximum zeros of remaining matrix.
Claim : If in 'n' steps I cut maximum possible zeros then choosing column or row with maximum
zeros in next step will give me intersection of maximum number of zeros in 'n+1' steps i.e. there is no 
other row or column that can give me more than this.
Then by induction I propose that the algorithm will cut maximum(all) zeros in minimum steps(lines).

Suppose not, there is another row/column which can give me better solution that means in 'n+1'th step,
it is intersecting more zeros than the one given by algorithm. That means this row/column have more 
zeros left than the one chosen by the greedy algorithm. It is a contradiction that mean no such 
row/column can exist.

![GitHub Logo](images/Intersect\ Zeros.jpg) 

<h4>
Complexity :
</h4>
Time: O(m\*n) + O(m+n)\*m = O(m+n)\*(m)	where m is smaller than n.
<br>
Space: O(m\*n)