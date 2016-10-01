<h2>[Sum of bit differences among all pairs](http://www.geeksforgeeks.org/sum-of-bit-differences-among-all-pairs/)</h2>

<h3>Statement</h3>
Given an integer array of n integers, find sum of bit differences in all pairs that can be formed from array elements. Bit difference of a pair (x, y) is count of different bits at same positions in binary representations of x and y. 
For example, bit difference for 2 and 7 is 2. Binary representation of 2 is 010 and 7 is 111 ( first and last bits differ in two numbers).

<h3>Algorithm Details</h3>
Keep count of sum at every place of 32 bits. Like how many numbers have a set bit at 0th, 1st, 2nd place and so on up to 32 bits.
 Let's say there are _n_ input numbers. If at a place there count of set bits is _b_ then count of unset bits is _n-b_. And total count will be sum of 
 _b*(n-b)_ for all 32 bits.
 
 <h3>Complexity</h3>
 Time : O(n) <br>
 Space : O(1)