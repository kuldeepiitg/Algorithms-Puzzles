First Missing Positive Number in Integer Array
==============================================

<h3>
Statement :
</h3>
Find first(smallest) positive integer which is absent in array. The array can have integer 
including negative values.

<h4>
Algorithm :
</h4>
Put 0 at indices where value is either greater than length of array itself or smaller than 0.
Map values at indices such that if array have <b>m</b> occurrences of <b>k</b> then value at 
index <b>k</b> will be <b>-m</b>. It can be done in cyclic traversal over array just like 
counting sort. 

<h4>
Complexity :
</h4>
Time : O(n) <br>
Space : O(1)