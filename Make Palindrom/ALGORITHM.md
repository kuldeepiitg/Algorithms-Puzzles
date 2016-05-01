Form a palindrome
=================

<h3>
Statement :
</h3>
Given a string, find the minimum number of characters to be inserted to convert it to palindrome. <br>

For Example:<br>
ab: Number of insertions required is 1. bab or aba <br>
aa: Number of insertions required is 0. aa <br>
abcd: Number of insertions required is 3. dcbabcd <br>
geeks: Number of insertions required is 3. skgeegks <br>

<h3>
Algorithm :
</h3>

Count(string) = Math.min(a,b,c), where <br>
a = Count(substring starting from second character to last), <br>
b = Count(substring starting from first character to second last), <br>
c = Count(substring starting from second character to second last) 
if first and last character are same, otherwise infinite. <br>
    