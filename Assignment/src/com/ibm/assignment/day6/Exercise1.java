package com.ibm.assignment.day6;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

public class Exercise1 {

	Demo obj = new Demo();

	@Test
	public void Test1_checkPositive() {
		int a = 1;
		int expectedResult = 1;
		int actualResult = obj.checkPositive(a);
		assertEquals(actualResult, expectedResult);
	}

	@Test
	public void Test2_checkPositive() {

		int a = 0;
		int expectedResult = 0;
		int actualResult = obj.checkPositive(a);
		assertEquals(actualResult, expectedResult);
	}

	@Test
	public void Test3_checkPositive() {

		int a = -1;
		int expectedResult = 0;
		int actualResult = obj.checkPositive(a);
		assertEquals(actualResult, expectedResult);
	}

}
