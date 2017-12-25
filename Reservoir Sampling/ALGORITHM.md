Reservoir Sampling(size = 1)
=======================================

<h3>
Statement :
</h3>
An infinite stream of numbers is given.
The stream is stopped at an arbitrary point.
Return any number of the stream read till now with equal probability, using O(1) space.
         
<h4>Algorithm</h4>
Select incoming number with probability of 1/n where n is count of number at that point of time including it.
Means retain the old number with probability (n-1)/n.