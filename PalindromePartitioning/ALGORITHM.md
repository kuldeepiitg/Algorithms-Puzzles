Palindrome Partitioning II
=======

#### Statement
Given a string s, partition s such that every substring of the partition is a palindrome.

Return the minimum cuts needed for a palindrome partitioning of s.

Example : 
Given 
s = "aab",
Return 1 since the palindrome partitioning ["aa","b"] could be produced using 1 cut.

##### Algorithm
Find all palindromes taking every character(or pair of characters) in center and spreading out.
Make a 2D array, keeping whose first index marks start and second index marks end index.

Now do BFS to reach to last palindrome and count the least number of hops(palindromes).

##### Complexities
Time: O(n^2)<br>
Space: O(n^2)