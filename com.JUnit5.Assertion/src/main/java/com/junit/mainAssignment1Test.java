package com.junit;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

public class mainAssignment1Test {

	Scanner sc = new Scanner(System.in);
	Assignment1 assign = new Assignment1();
	
	
	@BeforeAll
	public void print()
	{
		System.out.println("Test is Running..........");
	}
	
	@Test
	public void testMakeUpperCase()
	{
		System.out.println("Enter Expected output for UpperCase test:");
		String name=sc.nextLine();
		assertEquals(name,assign.makeUpperCase());
	}
	
	@Test
	public void testFindNumPositiveOrNot()
	{ 
		assertTrue(assign.findNumPositiveOrNot());
	}
	
    @Test
    public void testFactorial()
    {
    	System.out.println("Enter Expected output for factorial no. test:");
	    int num=sc.nextInt();
    	assertEquals(num, assign.factorial());
    }

    @AfterAll
	public void printAfter()
	{
		System.out.println("Test is Complete..........");
	}
}
