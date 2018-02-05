package com.au.afl.service;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import com.au.afl.constant.TestConstantsResult;

@RunWith(MockitoJUnitRunner.class)
public class NumberIteratorServiceTest {
	
	@InjectMocks
	NumberIteratorServiceImpl numberIteratorServiceImpl;
	
	public int firstNumber = 0;
	public int secondNumber = 0;
	public int integersLength = 0;
	public StringBuilder resultMessage = new StringBuilder();
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testNumberIteratorOddNumbers() throws Exception{
		integersLength = 10;
		firstNumber = 3;
		secondNumber = 5;
		resultMessage = numberIteratorServiceImpl.executeNumberIterator(integersLength, firstNumber, secondNumber);
		assertEquals(TestConstantsResult.setResultMessageOddNumber().toString(), resultMessage.toString());
	}
	
	@Test
	public void testNumberIteratorEvenNumbers() throws Exception{
		integersLength = 10;
		firstNumber = 2;
		secondNumber = 4;
		resultMessage = numberIteratorServiceImpl.executeNumberIterator(integersLength, firstNumber, secondNumber);
		assertEquals(TestConstantsResult.setResultMessageEvenNumber().toString(), resultMessage.toString());
	}
}
