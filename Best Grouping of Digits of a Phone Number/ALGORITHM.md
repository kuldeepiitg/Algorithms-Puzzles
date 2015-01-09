Best Grouping of Digits of a Phone Number
======================

<h3>
Statement :
</h3>
You are given a String number containing the digits of a phone number

(the number of digits, n, can be any positive integer) . To help you memorize the number, you want to divide it into groups of contiguous digits. Each group must contain exactly 2 or 3 digits. There are three kinds of groups:

• Excellent: A group that contains only the same digits. For example, 000 or 77.

• Good: A group of 3 digits, 2 of which are the same. For example, 030, 229 or 166.

• Usual: A group in which all the digits are distinct. For example, 123 or 90.

The quality of a group assignment is defined as 2 × (number of excellent groups) + (number of good groups)

Divide the number into groups such that the quality is maximized.

Design an efficient algorithm to return the solution that maximizes the quality.

<h4>
Algorithm :
</h4>
Use dynamic programming. Choose two or three characters and find best grouping with rest of digits.
Take maximum of the two possibilities.

```
Best(n) = Max(Best(2)+Best(n-2), Best(3)+Best(n-3))
		where Best(2) = 2 if both digits are same,
						= 0 otherwise
				Best(3) = 2 if all the three digits are same,
						= 1 if two of the digits are same,
						= 0 otherwise
				Best(1)	= 0
```
				
<h5>
Complexity :
</h5>
Time : O(n) <br>
Space : O(n)

<h4>
Second Approach :
</h4>
Solve it without using much of space. Just like Fibonacci can be solved two ways. Start from 
bottom to top.

<h5>
Complexity :
</h5>
Time : O(n) <br>
Space : O(1)
				
