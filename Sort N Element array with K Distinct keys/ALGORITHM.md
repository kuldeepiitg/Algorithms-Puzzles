Sort an Array with Integer Keys having low Variance
===================================================

<h3>
Statement :
</h3>
Given an array with integer such that difference between minimum and maximum is less than size of the array. Sort it efficiently. Efficiently means O(n) time and O(1) space.

<h4>
Algorithm :
</h4>
Subtract minimum from each key, now the array must contain keys with in 0 to N-1.
Map all the keys at corresponding index such that if there are <b>k</b> occurrences of <b>x</b> then 
index <b>x</b> will have value <b>-k</b>. 

Once Whole array is mapped, put keys in place.


<h4>
Complexity :
</h4>
Time : O(n) <br>
Space : O(1)