Pairs Having Sum More Than Threshold
====================================

<h3>
Statement :
</h3>
Count number of pairs having sum greater than given number <b>n</b> in a sorted array.

<h4>
Algorithm :
</h4>
Take two index pointers. First pointing at 0th index and second pointing at last index.
For every first pointer element, move second pointer to left until sum of elements pointed by two 
pointers become less than <b>n</b>. So all the elements falling in the left of second pointer will make pairs with element pointed by first which have sum greater than or equal to n. 
Note the index when first pointer hits second. All the elements right to this point will give
pairs having sum greater than threshold.

<h4>
Complexity :
</h4>
Time : O(n) <br>
Space : O(1) 

[Explore more](http://www.careercup.com/question?id=5675917835763712)
