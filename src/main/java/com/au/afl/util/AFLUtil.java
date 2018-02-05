package com.au.afl.util;

import com.au.afl.enums.AFLEnums;

public class AFLUtil {
	
	/**
     * This will select the appropriate Divisible
     * @param numberDivisible
     * @param iNext
     * @return
     */
    public static AFLEnums validateNumber(int numberDivisible, int iNext) {
        AFLEnums aflEnums = null;
        boolean divisible = (iNext % numberDivisible) == 0;
        if (divisible){
            aflEnums = AFLEnums.DIVISIBLE_TRUE;
        }else{
            aflEnums = AFLEnums.DIVISIBLE_FALSE;
        }
        return aflEnums;
    }
	
   /**
     * Generate number of players here
     * @param totalChildren
     * @return
     */
    public static int[] generatePlayers(int totalChildren) {
        int[] iTotalChildren = new int[totalChildren];
        for (int i = 0; i < iTotalChildren.length; i++){
            iTotalChildren[i] = i + 100;
        }
        return iTotalChildren;
    }
}
