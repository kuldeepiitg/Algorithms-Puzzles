No Two Consecutive Zeros in a Binary String
============================================

<h3>Statement : </h3>
Find number of strings of length n which don't have any two consecutive zeros.

<h4> Algorithm : </h4>
A '1' can be concatenated on right side with strings of length
 n-1 which don't have consecutive zeros, 
new formed strings of length 'n' will also hold the property.
If '0' is concatenated then element left to it must be a 1 
otherwise we will end up in having two consecutive zeros.
that is equivalent of concatenating '10' to strings of length n-2.


Number of strings of length 'n' = C(n)
C1) = 2 <br>
C(2) = 3 <br>
C(n) = C(n-1) + C(n-2) <br>

Use <b>Dynamic Programming</b>.

<h4> Pseudo Code : </h4>
Recurrence equation is enough to make pseudo code.