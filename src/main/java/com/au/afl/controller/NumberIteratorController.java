package com.au.afl.controller;

import com.au.afl.exception.AFLException;
import com.au.afl.service.NumberIteratorService;
import com.au.afl.service.NumberIteratorServiceImpl;

public class NumberIteratorController {
	public static void main(String[] args) throws AFLException {
		try {
			int integersLength = 10;
			int firstNumber = 3; 
			int secondNumber = 5;
			
			StringBuilder resultMessage = new StringBuilder();
			NumberIteratorService numberIteratorService = new NumberIteratorServiceImpl();
			resultMessage = numberIteratorService.executeNumberIterator(integersLength, firstNumber, secondNumber);
			
			System.out.println("Result Message \n" + resultMessage.toString());
		} catch (Exception e) {
			throw new AFLException("The system encountered error");
		}
	}   
}
		