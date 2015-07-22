Color Blocks
============

<h3>
Statement :
</h3>
Color blocks such that no more than two consecutive boxes are colored with same color and we have only red and black color. How many such ways are there?

<h4>
Algorithm 1:
</h4>
If we know number of configurations for n-1 blocks where last two blocks were RR, BR, RB, BB then we can find number of configurations for n blocks. 
Recursion for that can be written as :
```
Count(RR, n) = Count(BR, n-1);
Count(BR, n) = Count(RB, n-1) + Count(BB, n-1);
Count(RB, n) = Count(RR, n-1) + Count(BR, n-1);
Count(BB, n) = Count(RB, n-1);
```

For two blocks it will be 1, 1, 1 and 1 configuration that can have RR, BR, RB and BB as last two blocks respectively.
If number of blocks is only one then there are only two configurations possible either red or black. Go on computing recursively.

<h5>
Complexity :
</h5>
Time : O(n) <br>
Space : O(n)

<h4>
Algorithm 2:
</h4>
We can use above recurrence iteratively, starting from 2 to 'n'.

<h5>
Complexity :
</h5>
Time : O(n) <br>
Space : O(1)

<h4>
Algorithm 3:
</h4>
On observing the recurrence relation closely , we get this idea that count of RR, RB, BR, BB are following fibonacci series.

```
(n)		2	3	4	5	6	7	8	9	10	...

RR : 	1	1	2	3	5	8	13	21	34	...
RB :	1	2	3	5	8	13	21	34	55	...
BR :	1	2	3	5	8	13	21	34	55	...
BB :	1	1	2	3	5	8	13	21	34	...

```

So observation is, <br>
	<b>n</b>th values of RR and BB are <b>n-1</b>th fibonacci number.<br>
	<b>n</b>th values of RB and BR are <b>n</b>th fibonacci number.<br>
	
So count of total possible ways to paint <b>n</b> blocks are <b>fib(n-1) + fib(n) + fib(n) + fib(n-1)</b> that is <b> 2(fib(n-1) + fib(n)) </b>

<h5>
Complexity :
</h5>
Time : O(log(n)) <br>
Space : O(1) <br>

Because <b>n</b>th <a href="http://www.geeksforgeeks.org/program-for-nth-fibonacci-number/"> fibonacci number </a> can be computed in log(n) time.
