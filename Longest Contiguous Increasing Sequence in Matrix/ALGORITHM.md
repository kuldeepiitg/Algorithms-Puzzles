Longest Contiguous Increasing Sequence in Matrix
=================

<h3>
Statement :
</h3>
Given a 2 dimensional array of unique values that could be either integers or floating point numbers, find the longest, contiguous, increasing sequence of values. When traversing the array, you can move up, down, left or right. 

For Example: 
```
  10 15 2 5 
   4 23 6 19 
   1 8 9 21 
```

The longest sequence is 1 -> 4 -> 10 -> 15 -> 23

<h4>
Algorithm :
</h4>
For every element find max sequence length of all its lesser neighbors and consider length for the sequence originating from this point to be one more than max. 
If there is no such neighbor then sequence length for that point is 1.

<h4>
Complexity :
</h4>
Time : O(n) <br>
Space : O(n) <br>
