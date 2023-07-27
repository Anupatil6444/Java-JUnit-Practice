package com.example;

import com.Junit.suite.*;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.endsWith;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

class NestedClass {

	@Nested
	public class testTestFactory
	{
		@TestFactory
		Collection<DynamicTest> dynamicTestsWithCollection() {
		    return Arrays.asList(
		      DynamicTest.dynamicTest("Add test",
		        () -> assertEquals(4, Math.addExact(3, 1))),
		      DynamicTest.dynamicTest("Boolean Test",
		        () -> assertEquals(true, 6<8)));
		}
	}
	
	@Nested
	class testAssertAll
	{
		@Test
		public void checkAuthorization()
		{
		String username="anupatil";
		String password="anu@123";
		Assertions.assertAll(
				() -> assertEquals(username,"anupatil"),
				() -> assertEquals(password,"anu@123"));
		}
		
		@Test
		public void testStringOper()
		{
			String msg = "Hi";
			Assertions.assertAll(
					() -> assertTrue(msg.endsWith("i")),
					() -> assertNotNull(msg)
					);
		}
	}
	
	@Nested
	@Suite
	@SelectPackages("com.Junit.suite")
	@SelectClasses(Calculator.class)
	class testSuitePackage
	{
		
	}
}
