package com.au.afl.service;

import org.apache.commons.lang.ArrayUtils;

import com.au.afl.exception.AFLException;
import com.au.afl.util.AFLUtil;

public class ChildrensGameServiceImpl implements ChildrensGameService{

    /**
     * This is the code that execute the game
     * @param totalChildren
     * @param selectedNumber
     * @return
     * @throws AFLException 
     */
    @Override
    public int gameExecution(int totalChildren, int runningNumber) throws AFLException{

        int[] iTotalChildren = AFLUtil.generatePlayers(totalChildren);

        int elementCounter = 0;
        int positionCounter = 0;

        try {
			do {
			    positionCounter++;
			    if (elementCounter>iTotalChildren.length-1) {
			    	elementCounter = 0;
			    }
			    if (positionCounter==runningNumber){
			        System.out.println("Player Out " + iTotalChildren[elementCounter]);

			        positionCounter = 0;
			        iTotalChildren = ArrayUtils.removeElement(iTotalChildren, iTotalChildren[elementCounter]);
			        elementCounter--;
			    }
			    elementCounter++;
			}while(iTotalChildren.length!=1);
		
        } catch (Exception e) {
			throw new AFLException("The system encounter error");
		}

        return iTotalChildren[0];
    }
}
