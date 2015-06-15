Max Tasks Scheduler for N Machines
==================================

<h3>
Statement :
</h3>
Given 'n' tasks, where each task is pair of start time and finish time.
Schedule maximum number of tasks using <b>'n'</b> processors.

<h4>
Idea :
</h4>
Take first processor, and apply schedule task finishing first strategy.
Apply same for second processor on remaining unscheduled tasks.

It won't work. Counter example.

In given figure, clearly two processors are sufficient to finish all.
But with our strategy task 2 will go unexecuted. Processor 1 will pick task 1 and 4.
Processor will pick only 3, not 2 because it is overlapping with 3.

![alt tag](https://raw.githubusercontent.com/kuldeepiitg/Google-Interviews/master/Max%20Tasks%20Scheduler%20for%20N%20Machines/images/Max%20tasks%20using%20N%20machines.jpg)