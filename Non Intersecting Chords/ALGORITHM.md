Non Intersecting Chords on a Circle
===================================

<h3>
Statement : Given 2n points on a circle.find the number of ways to draw n non intersecting chords.
</h3>

<h4>
Algorithm :
</h4>

Take two points on circle to make a chrod. 
This cord will divide circle into two convex connected loops which can further be considered as circles.
Find number of ways for these smaller circles and use them to find total.

Recurrence equation: 
C(2n) = ∑C(2k)*C(2n-2-2k), where k is such that k < n and n-1-k >= 0

Use dynamic programming. We must divide circle such that both of the newly formed circles have even points.
If not, then either we won't have n chords or we will end up in intersection of a chord in to our dividing chord.

<h4>
Pseudo code:
</h4>

```
	Make a look up table. 
	
	to compute C(2n),
	sum of P(k) for k between 0 to n-1 :
		compute C(2k) and C(2n-2-2k), and save if they are not in table
		otherwise pick them from table
		P(k) = C(2k)*C(2n-2-2k)
	
	return C(2n)
```

<h4>
Complexity:
</h4>
Time : O(n)<br>
Space : O(n)


