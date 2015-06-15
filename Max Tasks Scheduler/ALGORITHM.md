Schedule Maximum Number of Tasks using One Processor
====================================================

<h3>
Statement : 
</h3>
Given 'n' tasks, where each task is pair of start time and finish time.
Schedule maximum number of tasks such that no two of them overlap.

<h4>
Algorithm :
</h4>
Sort all the tasks by finish time. Task finishing earlier, schedule first.
If next earliest finish task is starting before finish time of already scheduled task, then drop it and look for next. Otherwise, schedule this task.

<h4>
Complexity : 
</h4>
Time : Sorting O(nLog(n)) + look for all tasks one by one O(n) = O(nLog(n)) <br>
Space : O(n) for n tasks = O(n)