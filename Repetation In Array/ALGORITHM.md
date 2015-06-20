First(smallest) Repeating element in Array with Elements from 1 to n
==========================================================

<h3>
Statement :
</h3>
An array of size n+1 has integers only from 1 to n. The integers 1 to n can be present 0 or more times in the array. Find the first(smallest) repeating element in the array.

<h4>
Algorithm :
</h4>
At every index in array put negative of count of values equal to the index. For example if array have three instances of 5, then index five is to be set with -3. And we will do that without taking any extra memory.


<h4>
Pseudo Code :
</h4>
```
For each index from 0 to n :
	if element at index is positive(>0) :
		take element at index in hand and put 0 at index,
		
		while true:
			if element at index equal to value at hand is > 0 :
				take the element in hand and put -1 at the index position,
			else 
				decrease element at index by 1,
				break,
		
Iterate over array to find smallest index that have negative value, return index

```	

<h4>
Complexity : 
</h4>
Time : O(n) <br>
Space : inplace O(1)		
			
			
			
			
		
		
		
	