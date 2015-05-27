Two Jugs problem
================

<h3>
Statement :
</h3>
Given 2 jugs of capacity a and b gallons, and an infinite supply of water, can you fill one of the jugs with exactly c gallons of water? You can neglect the effects of spillage or residue after each pour, and assume you have infinite time to do the pouring.

http://www.math.tamu.edu/~dallen/hollywood/diehard/diehard.htm

<h4>
Example :
</h4>
Given two jugs of capacity 5 and 3 liters, get 4 liters of water.<br>

1. Fill jug 5' fully and take 3' jug empty.
2. Pour jug 5' to 3' until 3' get filled fully, now you have 5' jug having with 2 liters and 3' having 3 liters.
3. Empty jug 3'. And transfer all 2 liters from 5' to 3'. Now 5' don't have water and 3' have 2 liters of water.
4. Fill 5' jug fully. Start pouring water from 5' to 3' until 3' get filled fully. That is only 1 liter of water will be transfered.
5. Now jug 5' have <b>4 liters</b> of water and 3' have 3 liters of water.

<h4>
Algorithm :
</h4>
Check if c is divisible by GCD(a,b)