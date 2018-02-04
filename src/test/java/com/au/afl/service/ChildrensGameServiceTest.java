package com.au.afl.service;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ChildrensGameServiceTest {
	
	@InjectMocks
	ChildrensGameServiceImpl childrensGameServiceImpl;
	
	public int totalChildren = 0;
	public int runningNumber = 0;
	public int winnerChild = 0;
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testChildrensGameRunningNumberLessthanTotal() throws Exception{
		winnerChild = 0;
		
		totalChildren = 10;
        runningNumber = 5;
        
		winnerChild = childrensGameServiceImpl.gameExecution(totalChildren, runningNumber);
		assertEquals(102, winnerChild);
	}
	
	@Test
	public void testChildrensGameRunningNumberGreaterthanTotal() throws Exception{
		winnerChild = 0;
		
		totalChildren = 8;
        runningNumber = 10;
        
		winnerChild = childrensGameServiceImpl.gameExecution(totalChildren, runningNumber);
		assertEquals(106, winnerChild);
	}
	
	@Test
	public void testChildrensGameRunningNumberEqualtoTotal() throws Exception{
		winnerChild = 0;
		
		totalChildren = 8;
        runningNumber = 8;
        
		winnerChild = childrensGameServiceImpl.gameExecution(totalChildren, runningNumber);
		assertEquals(103, winnerChild);
	}
	
	@Test(expected = NegativeArraySizeException.class)
	public void testChildrensGameException() throws Exception{
		
		winnerChild = 0;
		totalChildren = -8;
        runningNumber = 8;
        winnerChild = childrensGameServiceImpl.gameExecution(totalChildren, runningNumber);
	}
	
}
