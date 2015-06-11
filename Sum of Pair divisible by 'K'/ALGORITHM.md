Sum of Pair in Array Divisible by Given Number
==============================================

<h3>
Statement : 
</h3>
Find all the pairs in given integer array such that sum of pair is divisible by 'k'.

<h4>
Algorithm :
</h4>
Divide all elements by 'k' and get remainder for each element. 
Now check for pairs which give me sum equal to 0 or 'k'.
That can be done by making a map with keys 0 to 'k-1'.

<h4>
Pseudo code :
</h4>

```
Make map with integer keys from 0 to k-1, each value entry for 
key 'i' will be set of all integers(in array) have result 'i' 
on modulo with 'k'.


for each element in array :
	remainder = element%k
	add element in set for key equal to remainder
	
For each i from 1 to (k-1)/2 :
    S<sub>i</sub> : set of elements with remainder i
    S<sub>k-i</sub> : set of elements with remainder k-i
    Pair all (a,b) such that a in S<sub>i</sub> and
		b in S<sub>i</sub>

Also pair (a,b) such that
	all unique a and b in S<sub>0</sub>
	
if k is even
	then also pair (a,b) such that
	all unique a and b in S<sub>(k-1)/2</sub>
```

<h4>
Complexity :
</h4>
Time : O(n) in making remainder set + O(n/2 * n/2) pairs we can get, so this much for pairing
	= O(n<sup>2</sup>)

Space : O(k) in map buckets + O(n) for all the sets + O(n<sup>2</sup> for all the pairs(in worst case) = O(k + n<sup>2</sup>)<br>
If output is not stored(accessed with iterator) then O(k) space.

<h4>
Note :
</h4>
We can make adjacency list type DS instead of map to save space because if k >> n
then it will leave lots of bucket empty. But then insertion in matrix will take log(n) time.
For that data structure will be something like as follows. <br>

Adjacency list's column(indexing) will have remainders in it which have at least one element.
So to insert an element, first compute its remainder. Search for the remainder (O(log(n)) time) in index column.
Insert at tail of list which will take O(1) assuming tail is also stored.

New time : O(nlogn) in making remainder set + O(n<sup>2</sup>) pairs we can get = O(n<sup>2</sup>)
New Space : O(n) in adjacency list + O(n<sup>2</sup> for all the pairs(in worst case) = O(n + n<sup>2</sup>) = O(n<sup>2</sup>)<br>
If output is not stored(accessed with iterator) then O(n) space.
