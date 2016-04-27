Subarray with given sum
======================

<h3>
Statement :
</h3>
Given an unsorted array of non-negative integers, find a continous subarray which adds to a given number.

<h3>
Algorithm :
</h3>
Take two pointers indices, increment right pointer until sum becomes equal or more than given value. If
it is more then increment left pointer until sum is equal or smaller than value. Give subarray from left
to right if sum is equal to desired.