<h3>[Taking 1 out of 3 consecutive](http://www.practice.geeksforgeeks.org/problem-page.php?pid=1231)</h3>

<h4>Statement</h4>
Given an array consisting of N non-negative numbers your 
task is to find the minimum sum of the array such that 
out of 3 consecutive  elements you need to add at-least one.

<h4>Strategy</h4>
**Dynamic Programming** is pretty good approach for this problem.
 
<h4>Algorithm</h4>

 * <h5>Description</h5>
 At every index how many elements can be skipped is said to be _offset allowance_. 
  So at a point offset allowance can be 0,1 or 2 depending of the fact
  whether last element was taken into sum or not. Offset allowance 
  0 means this element must have to be 
  selected because last two elements are skipped.
   1 means at most one element can be skipped because 
   only last element was skipped and last to last was 
   taken into sum.
    2 means at most 2 elements can be skipped because last element was taken into sum.
     
 * <h5>Recurrence Relation</h5>
 MinSum(index, allowance) is minimum sum computed subarray starting with index for given offset allowance.<br>
 MinSum(index, allowance) = array[index] + MinSum(index + 1, 2); if allowance is 0.<br>
 MinSum(index, allowance) = Minimum((array[index] + MinSum(index + 1, 2)), MinSum(index+1, 0)); if allowance is 1.<br>
 MinSum(index, allowance) = Minimum((array[index] + MinSum(index + 1, 2)), MinSum(index + 1, 1)); if allowance is 2.
 
 * <h5>Complexity</h5>
 Time : O(n) <br>
 Space : O(n) <br>
 