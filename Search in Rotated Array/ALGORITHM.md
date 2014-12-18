Search key in Rotated Sorted Array
==================================

<h3>
Statement :
</h3>
Given a sorted array which is rotated by some unknown offset. 
Check if there exists given key
in the array. If yes, then return index of element in array.

<h4> 
Algorithm :
</h4>

<h5>
Method 1 : 
</h5>
Find the pivot around which the array is rotated by binary search. 
Then apply binary search on left and right subarray to find searched key index.

<h6>
Finding Pivots :
</h6> If start element is more than middle then pivots must be in left half.
If not, then check whether middle is larger than end element, if yes than 
pivot will be in right half. If none of the two condition holds that means
start is smaller than middle element and middle element is smaller than end element so
the whole array is in sorted order and start i.e. 0 is pivot.

<h5>
Method 2 :
</h5>
If element is equal to middle element then return middle index.
If left half of array is sorted i.e. it does not contain pivot and element lie between
start and mid then search in this part otherwise search in right part. Else if right half is sorted 
and element lie between mid and end then search in this half otherwise search in left half.

<h4>
Complexity :
</h4>
Time : O(log(n))
<br>
Space : O(1)