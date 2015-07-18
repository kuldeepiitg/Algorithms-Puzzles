Zig Zag Sorting
===============

<h3>
Statement :
</h3>
Given an array of integers, sort it in zig-zag order. That is second element is larger than first,
third is smaller than second, fourth is larger than third and so on. There can be more than one such configurations, only one is needed to be found.

<h4>
Algorithm :
</h4>
If element at odd index is smaller than previous then swap it with that.
If element at even index is larger than previous then swap it with that.
Otherwise don't do anything.

<h4>
Complexity :
</h4>
Time : O(n)<br>
Space : O(1)