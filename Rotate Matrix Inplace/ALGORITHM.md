Rotate Matrix Inplace
====================

<h3>
Problem Statement: Rotate a matrix clockwise by 90 degree inplace (without using extra memory).
</h3>

<h4>
Algorithm:
</h4>

Rotate it in circular fashion. Like if M(0,0) have been picked then remember M(0,n) and put M(0,0) on M(0,n). Now place old M(0,n) at M(n,n) following saving M(n,n).

