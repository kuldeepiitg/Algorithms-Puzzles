Inversions in Array
=====================

<h3>
Statement :
</h3>
Pair of indices i,j is called an inversion if i < j  and array[i] > array[j].
Given an array count total number of inversions.

<h4>
Algorithm :
</h4>
Divide and conquer. Use approach like merge sort.
Sort first half and second half independently.
While merging count how many elements of first half
are skipped when an element of second half is put in place
in sorted array. Take total from each and every step.

<h3>
Complexity : 
</h3>
Time : O(nlogn)<br>
Space : O(nlogn), space can be optimized to O(n).