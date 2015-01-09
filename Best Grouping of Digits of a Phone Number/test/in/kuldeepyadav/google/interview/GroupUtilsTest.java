package in.kuldeepyadav.google.interview;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Junit test for {@link GroupUtils}.
 * 
 * @author kuldeep
 */
public class GroupUtilsTest {

	@Test
	public void testGetBestGroup() {
		
		String phoneNumber = "11010";
		String bestGrouping = GroupUtils.getBestGroup(phoneNumber);
		
		assertEquals("11" + GroupUtils.delimiter + "010", bestGrouping);
		assertEquals(3, GroupUtils.getScore(bestGrouping));
	}

}
