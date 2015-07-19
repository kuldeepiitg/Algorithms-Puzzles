Color Blocks
============

<h3>
Statement :
</h3>
Color blocks such that no more than two consecutive boxes are colored with same color and we have only red and black color. How many such ways are there?

<h4>
Algorithm :
</h4>
If we know number of configurations for n-1 blocks where last two blocks were RR, BR, RB, BB then we can find number of configurations for n blocks. 
Recursion for that can be written as :
```
Count(RR, n) = Count(BR, n-1);
Count(BR, n) = Count(RB, n-1) + Count(BB, n-1);
Count(RB, n) = Count(RR, n-1) + Count(BR, n-1);
Count(BB, n) = Count(RB, n-1);
```

For two blocks it will be 1, 1, 1 and 1 configuration that can have RR, BR, RB and BB as last two blocks respectively.
If number of blocks is only one then there are only two configurations possible either red or black.

<h4>
Complexity :
</h4>
Time : O(n) <br>
Space : O(n)