Non Intersecting Chords on a Circle
===================================

<h3>
Statement : Given 2n points (n pairs of points) on a circle.find the number of ways to draw n non intersecting chords.
</h3>

<h4>
Algorithm :
</h4>

Take two points on circle to make a chrod. 
This cord will divide circle into two convex connected loops which can further be considered as circles.
Find number of ways for these smaller circles and use them to find total.

Recurrence equation: 
C(n) = ∑C(k)*C(n-1-k), where k is such that k < n and n-1-k >= 0

Use dynamic programming. We must divide circle such that both of the newly formed circles have even points.
If not, then either we won't have n chords or we will end up in intersection of a chord in to our dividing chord.

<h4>
Pseudo code:
</h4>

```
	Make a look up table. 
	
	C(0) = 1
	to compute C(n),
	sum of P(k) for k between 0 to n-1 :
		compute C(k) and C(n-1-k), and save if they are not in table
		otherwise pick them from table
		P(k) = C(k)*C(n-1-k)
	
	return C(n)
```

<h4>
Complexity:
</h4>
Time : O(n)<br>
Space : O(n)

Note : C(n) is equal to nth Catalan number. So it can be computed in O(n) space by evaluating 
the formula.


