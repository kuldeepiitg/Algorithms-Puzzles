Gas Station on Circular Road  
==========

####Statement
There are N gas stations along a circular route, where the amount of gas at station i is gas[i].

You have a car with an unlimited gas tank and it costs cost[i] of gas to travel from station i to its next station (i+1). You begin the journey with an empty tank at one of the gas stations.

Return the minimum starting gas station’s index if you can travel around the circuit once, otherwise return -1.

You can only travel in one direction. i to i+1, i+2, ... n-1, 0, 1, 2..
Completing the circuit means starting at i and ending up at i again.

##### Algorithm
Start with first gas station, keep on filling and burning fuel. If empties in between, start with next
station and keep on filling.

##### Complexity
Time: O(n) <br>
Space: O(1)
