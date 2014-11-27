Anagrams Sorting
==================

<h3>
Statement :
</h3>
Write a method to sort an array of strings so that all the anagrams are next to each other.

<h4>
Algorithm :
</h4>
Consider strings equal if they are anagrams otherwise take them lexicographically. 

To check if they are anagrams make a hashmap
where key is a character and value is number of instances of the character in string. 
Now check is the two strings have equal number
of instances of each character.

<h4>
Complexity:
</h4>
Anagrams Time : O(n) <br>
		Space : O(1) because character set is finite, so is the size of keyset of hashmap.
		
Sorting Time : O(nlogn) <br>
		Space : O(n) if temperory array is removed and inplace merging is done then it will be O(1)