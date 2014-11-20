Rotate Matrix Inplace
====================

<h3>
Problem Statement: Rotate a matrix clockwise by 90 degree inplace (without using extra memory).
</h3>

<h4>
Algorithm:
</h4>

Rotate it in circular fashion. Like if M(0,0) have been picked then remember M(0,n) and put M(0,0) on M(0,n). Now place old M(0,n) at M(n,n) following saving M(n,n).

<h5>
Pseudo code:
</h5>
```
for ith row where i ∈ [0,⌈n/2⌉] :
  for jth column where j ∈ [i,n-2-i] :
    save M(j, n-1-i), and put M(i,j) at M(j, n-1-i)
    save M(n-1-i, n-1-j), and put previous M(j, n-1-i) at M(n-1-i, n-1-j)
    save M(n-1-j, i), and put previous M(n-1-i, n-i-j) at M(n-1-j, i),
    put previous M(n-1-j, i) at M(i,j)
```

<h5>
Complaxity:
</h5>
Time complaxity = O(n<sup>2</sup>)

Space Complaxity = O(1)
