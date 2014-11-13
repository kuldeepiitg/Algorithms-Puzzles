package com.kuldeep.google.interview;

import static org.junit.Assert.*;

import org.junit.Test;

import com.kuldeep.google.interview.Jump;

/**
 * Junit test for {@link Jump}.
 * 
 * @author kuldeep
 */
public class JumpTest {

	@Test
	public void test() {
		 
		int[] walk = new int[]{4,10,5,5,6,3};
		Jump jump = new Jump(walk);
		assertEquals(2, jump.jump());
	}

}
