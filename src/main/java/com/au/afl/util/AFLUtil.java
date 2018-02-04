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
			switch (numberDivisible){
				case 1:
					aflEnums = AFLEnums.DIVISIBLE_ONE;
					break;
				case 2:
					aflEnums = AFLEnums.DIVISIBLE_TWO;
					break;
				case 3:
					aflEnums = AFLEnums.DIVISIBLE_THREE;
					break;
				case 4:
					aflEnums = AFLEnums.DIVISIBLE_FOUR;
					break;
				case 5:
					aflEnums = AFLEnums.DIVISIBLE_FIVE;
					break;
				case 6:
					aflEnums = AFLEnums.DIVISIBLE_SIX;
					break;
				case 7:
					aflEnums = AFLEnums.DIVISIBLE_SEVEN;
					break;
				case 8:
					aflEnums = AFLEnums.DIVISIBLE_EIGHT;
					break;
				case 9:
					aflEnums = AFLEnums.DIVISIBLE_NINE;
					break;
				default:
					aflEnums = AFLEnums.DIVISIBLE_NONE;
					break;
					
			}
		}else{
			aflEnums = AFLEnums.DIVISIBLE_NONE;
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
