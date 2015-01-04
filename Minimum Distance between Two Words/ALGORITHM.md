Minimum Distance between Two Words
==================================

<h3>
Statement :
</h3>
You have a large text file containing words. 
Given any two words, find the shortest distance 
(in terms of number of words) between them in 
the file. Can you make the searching operation 
in O(1) time? What about the space complexity 
for your solution?

<h4>
Algorithm :
<h4>
Make a hashmap of words and position. Iterate through
the file and when a word is hit save position number in map.
Finally, when the preprocessing will be done, we will have
word as key and list of positions as value.
For any two word take their lists out. Each list will be in sorted 
order. Just iterate over two lists like we do in merging, to find least distance.

<h4>
Complexity :
</h4>
Time : O(n), Amortized : O(1) <br>
Space : O(n)