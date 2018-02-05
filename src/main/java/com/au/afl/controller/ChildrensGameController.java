package com.au.afl.controller;

import com.au.afl.exception.AFLException;
import com.au.afl.service.ChildrensGameService;
import com.au.afl.service.ChildrensGameServiceImpl;

public class ChildrensGameController {

    public static void main(String[] args) throws AFLException {
        
    	try {
			int winnerChild = 0;
			int totalChildren = 10;
			int runningNumber = 5;
			
			ChildrensGameService childrensGameService = new ChildrensGameServiceImpl();
			winnerChild = childrensGameService.gameExecution(totalChildren, runningNumber);

			System.out.println("The winner is " + winnerChild);
		} catch (Exception e) {
			throw new AFLException("The system encountered error ");
		}
    }
}
