Robot Reachability
==================

<h3>Statement</h3>
A robot's movement is confined by following rule. 
If robot is currently standing on (x, y) then it can go to either (x+y, y) or (x, x+y).
Given a starting point and ending point, check if robot can reach to later from first.

<h3>Algorithm</h3>
Use BFS. Discard points which have x or y value more than coordinates of end point.

<h3>Complexity</h3>
Time : might be O(n), not sure though
Space : ---