Balanced Parenthesis in a very Large File
==========================================

<h3>
Statement :
</h3>
There is a large file(1TB) containing braces. 
Question is to check for their balance. 
Make this process parallel (meaning to see if 
this problem can be solved through parallelism, 
like dividing the the problem into sub problem….) 
Remember the file is very large.

<h4>
Algorithm :
</h4>
If we have n cores available then break file into n equal parts 1,2,3...n. <br>
A thread is reading one part, count of unmatched left and right parenthesis.
Initially count of left parenthesis is zero. If a left parenthesis comes then
increment left parenthesis counter by 1. If a right parenthesis comes then 
decrement left parenthesis counter given the condition that left parenthesis 
counter is positive non zero number. Else if left parenthesis count is zero then 
increment right parenthesis count by 1. Finally left count will be number of all
unmatched left brackets and right count will be number of all unmatched right 
brackets. 

0 - R1 + L1 - R2 + L2 ... - Ri + Li ... - Rn + Ln,
where Ri is count of right brackets from ith part of file and Li is count of
left brackets.<br>
At any point value of prefix of above expression should not be negative. And value 
of whole expression will have to be 0.

Let's say in a file I have a character sequence as follow.<br>
((()())))()()((( <br>
R = 1 <br> 
L = 3 <br>

<h4>
Complexity :
</h4>
Time : O(n) <br>
Space : O(1)