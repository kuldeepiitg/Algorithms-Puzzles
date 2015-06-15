package in.interview.microsoft;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/**
 * Task scheduler.
 * 
 * @author kuldeep
 */
public class Scheduler {

	/**
	 * @param givenTasks
	 * 			list of all {@link Task}s.
	 * @return list of maximum schedulable tasks using one processor.
	 */
	public static List<Task> maxSchedulableTasks(List<Task> givenTasks) {
		
		List<Task> schedulableTasks = new ArrayList<Scheduler.Task>();
		
		Comparator<Task> comparator = new Comparator<Scheduler.Task>() {
			
			@Override
			public int compare(Task t1, Task t2) {
				return t1.getFinishTime() - t2.getFinishTime();
			}
		};
		Collections.sort(givenTasks, comparator);
		
		int lastTaskFinishingTime = 0;
		
		for (Task task : givenTasks) {
			if (task.getStartTime() > lastTaskFinishingTime) {
				schedulableTasks.add(task);
				lastTaskFinishingTime = task.getFinishTime();
			}
		}
		return schedulableTasks;
	}
	
	/**
	 * @param givenTasks
	 * 		list of all {@link Task}s.
	 * @return required number of processors to execute all the tasks before their deadline.
	 */
	public static int requirementToSchedule(List<Task> givenTasks) {
		
		Comparator<Task> comparator = new Comparator<Scheduler.Task>() {
			
			@Override
			public int compare(Task t1, Task t2) {
				return t1.getStartTime() - t2.getStartTime();
			}
		};
		Collections.sort(givenTasks, comparator);
		PriorityQueue<Integer> processors = new PriorityQueue<Integer>();
		
		int maxRequired = 0;
		for (Task task : givenTasks) {
			if(processors.peek() != null && processors.peek() < task.getStartTime()) {
				processors.remove();
			}
			processors.add(task.getFinishTime());
			maxRequired = processors.size() > maxRequired ? processors.size() : maxRequired;
		}
		
		return maxRequired;
	}
	
	/**
	 * Processor task, start time must be more than or equal to 1.
	 * End time must be more than start time.
	 * 
	 * @author kuldeep
	 *
	 */
	public static class Task {
		
		/**
		 * Start time of a task.
		 */
		private int startTime;
		
		/**
		 * End time of a task.
		 */
		private int finishTime;

		public Task(int startTime, int finishTime) {
			super();
			this.startTime = startTime;
			this.finishTime = finishTime;
		}

		/**
		 * @return the startTime
		 */
		public int getStartTime() {
			return startTime;
		}

		/**
		 * @return the endTime
		 */
		public int getFinishTime() {
			return finishTime;
		}
		
		@Override
		public String toString(){
			return "(" + startTime + ", " + finishTime + ") ";
		}
	}
}
