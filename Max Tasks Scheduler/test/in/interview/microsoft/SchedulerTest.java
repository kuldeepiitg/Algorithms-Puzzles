package in.interview.microsoft;

import static org.junit.Assert.assertEquals;
import in.interview.microsoft.Scheduler.Task;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * Junit test for {@link Scheduler}.
 * 
 * @author kuldeep
 */
public class SchedulerTest {

	@Test
	public void testMaxSchedulableTasks() {
		
		List<Task> givenTasks = new ArrayList<Scheduler.Task>();
		givenTasks.add(new Task(10, 20));
		givenTasks.add(new Task(15, 45));
		givenTasks.add(new Task(40, 100));
		givenTasks.add(new Task(50, 60));
		givenTasks.add(new Task(52, 60));
		givenTasks.add(new Task(55, 60));
		givenTasks.add(new Task(80, 90));
		
		assertEquals(3, Scheduler.maxSchedulableTasks(givenTasks).size());
		assertEquals(4, Scheduler.requirementToSchedule(givenTasks));
	}

}
