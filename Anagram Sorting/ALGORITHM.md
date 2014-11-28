Anagrams Sorting
==================

<h3>
Statement :
</h3>
Write a method to sort an array of strings so that all the anagrams are next to each other.

<h4>
Algorithm :
</h4>
To compare two strings, sort them character by character and compare the sorted characters array lexicographically. If both of them are equal then consider strings to be equal.

<h4>
Complexity :
</h4>
Time: O(nlogn)*O(klogk) where k is upperbound on length of strings.<br>
Space : O(n) in sorting. It can be reduced to O(1) if we do inplace merging.
