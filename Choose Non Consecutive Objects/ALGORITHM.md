Choose Non Consecutive Objects
###############################

<h3>
Statement :
</h3>
Given n identical books(objects), find number of ways of choosing r non-consecutive books.

<h4>
Algorithm :
</h4>
select first object and find r-1 objects in last n-2 objects. We can't consider next object
in domain of remaining selection otherwise it will give us consecutive selection. 
Or reject first element and find r objects in last n-1 objects.

Recurrence Relation :
```
F(n,r)  = n     if r = 1,
        = 0     if r > n,
        = F(n-2,r-1) + F(n-1,r)     otherwise.
```

<h4>
Complexity :
</h4>
Time : O(n×r), quite loose bound.
Space: O(n×r)
