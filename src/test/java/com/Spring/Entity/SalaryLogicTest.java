package com.Spring.Entity;

import static org.junit.Assert.*;

import org.junit.Test;

public class SalaryLogicTest {
	 //Test 1 : GetSalUsingEmpId Method 
	@Test
	public void testGetSalUsingEmpId() {
		SalaryLogic s1=new SalaryLogic();
		assertEquals(true,s1.getSalUsingEmpId());
		//fail("Not yet implemented");
	}

	//Test 2 : ViewAllSal Method
	@Test
	public void testViewAllSal() {
		SalaryLogic s1=new SalaryLogic();
		assertEquals(true,s1.ViewAllSal());
		//fail("Not yet implemented");
	}

}
