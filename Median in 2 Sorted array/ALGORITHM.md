Median of two Equal Size Sorted Arrays
======================================
Find median of two equal size sorted arrays.

<h3>
Statement :
</h3>
There are given two sorted arrays in ascending order. 
Find median of the sorted array found by merging them.

<h4>
Algorithm :
</h4>
Find mid element of both the arrays. If both are equal then value of median is equal to that.
Otherwise, repeat the process by taking subarrays. Take first half subarray if the median is larger 
than median of second and take second half for other array. If size of both the subarrays are 1, 
then return anyone of them as median.

<h4>
Complexity :
</h4>
Time : O(log(n)) <br>
Space :  O(n) for storing arrays.