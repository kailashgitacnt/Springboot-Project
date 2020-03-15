/**
 * 
 */
package com.sg.ms.employeeportal.controller;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author Admin
 *
 */
@SpringBootTest
public class EmployeeControllerTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("before");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		System.out.println("tear down!");
	}

	/**
	 * Test method for {@link com.sg.ms.employeeportal.controller.EmployeeController#newEmployee(com.sg.ms.employeeportal.model.Employee)}.
	 */
	@Test
	public void testNewEmployee() {
		assertNull(null);
	}

	/**
	 * Test method for {@link com.sg.ms.employeeportal.controller.EmployeeController#all()}.
	 */
	@Test
	public void testAll() {
		assertNull(null);
	}

}
