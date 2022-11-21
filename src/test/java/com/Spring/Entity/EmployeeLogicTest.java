package com.Spring.Entity;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmployeeLogicTest {
	
	//Test 1 : viewEmployee Method
	@Test
	public void testViewEmployees() {
		EmployeeLogic E1=new EmployeeLogic();
		assertEquals(true,E1.viewAll());
		
	}

	//Test 2 : UpdateEmployee Method
	@Test
	public void testUpdateEmployeesName() {
		EmployeeLogic E1=new EmployeeLogic();
		assertEquals(true,E1.updateEmployeesName());
		
	
	}

}
