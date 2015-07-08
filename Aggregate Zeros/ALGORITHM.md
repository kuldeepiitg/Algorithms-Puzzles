Aggregate Zeros after all Non-zero elements maintaining Order of Non-zero elements
===============================================================================

<h3>
Statement :
</h3>
Aggregate all zeros in last of array, such that all non-zero elements are in beginning one after. Also order between non-zero elements is to be maintained.

<h4>
Algorithm :
</h4>
Take two index pointers. First pointing to leftmost index which have zero.
Initially second pointer also points where first points.
Then go on incrementing second pointer, if element under it is non-zero then put it where first
pointer points and increment first pointer by one.

<h4>
Complexity :
</h4>
Time : O(n) <br>
Space : O(1)
