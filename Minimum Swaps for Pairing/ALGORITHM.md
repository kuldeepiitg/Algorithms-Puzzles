<h3>[Minimum number of swaps required for arranging pairs adjacent to each other](http://www.geeksforgeeks.org/minimum-number-of-swaps-required-for-arranging-pairs-adjacent-to-each-other/)</h3>

<h4>Statement</h4>
There are n-pairs and therefore 2n people. 
Everyone has one unique number ranging from 1 to 2n. 
All these 2n persons are arranged in random fashion in an Array of size 2n. 
We are also given who is partner of whom. 
Find the minimum number of swaps required to arrange these pairs such that all pairs become adjacent to each other.

``` 
Input:
    n = 3  
    pairs[] = {1->3, 2->6, 4->5}  // 1 is partner of 3 and so on
    arr[] = {3, 5, 6, 4, 1, 2}
    
    
Output: 2
    We can get {3, 1, 5, 4, 6, 2} by swapping 5 & 6, and 6 & 1
```

<h4>Algorithm Description</h4>
Find cycles. Let's say element Ei need Ej, so Ej will be placed in place of Ek. Keeping Ek in hand, say El pairs up with this
put Ek near to El by replacing Em. Now repeat for Em keep doing it until cycle finishes. Say there are 
'l' such cycles each involving Si elements for i in [1,l]. Each Si is even.

Total swaps required: Σ((Si/2) - 1) for all i ∈ [1, l]. 

Because for a cycle of length 2m, number of swaps required are m - 1.

<h4>Complexity</h4>
Time : O(n) <br>
Space: O(n) to store initial indexes of each element in array.


