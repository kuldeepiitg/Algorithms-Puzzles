Islands in Matrix
=================

<h3>
Statement :
</h3>
Given a ocean(2D grid), where a cell can have water or land. 
An island is group(or single) of consecutive cells having land.
Count number of islands.

<h4>
Algorithm :
</h4>
Traverse matrix along rows. If we encounter land then increment count and submerge it into ocean.
To submerge it use Depth/Breadth First Traversal.

<h4>
Data Structure :
</h4>
Ocean is a 2-D matrix, containing boolean values. True repersents land at the location and Flase is for water.

<h4>
Pseudo Code:
</h4>
```
islandCount = 0;
For each cell in matrix(ocean) :
	if cell is true(land) :
		islandCount = islandCount + 1,
		start breadth first traversal 
		recursively to find all land 
		cordinates that are consecutive
		and mark them all false
```

<h4>
Complexity :
</h4>
Time : each cell will be touched atmost 6 times, so O(n) <br>
Space : O(1) 