Line Passing through Maximum Number of Points on a 2-D Graph
=============================================================

<h3>
Statement :
</h3>
Given a two dimensional graph with points on it, find a line which passes the most number of points.

<h4>
Algorithm :
</h4>
For every two points on graph, find slope and y-intercept. Keep count of pairs which gave a particular 
slope and y-intercept using hashmap.

<h4>
Complexity :
</h4>
Time : O(n<sup>2</sup>) <br>
Space : O(n<sup>2</sup>)