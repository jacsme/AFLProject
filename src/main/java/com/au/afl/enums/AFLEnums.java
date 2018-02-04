package com.au.afl.enums;

public enum AFLEnums {
	
	DIVISIBLE_ONE(1), 
	DIVISIBLE_TWO(2), 
	DIVISIBLE_THREE(3),
	DIVISIBLE_FOUR(4),
	DIVISIBLE_FIVE(5),
	DIVISIBLE_SIX(6),
	DIVISIBLE_SEVEN(7),
	DIVISIBLE_EIGHT(8),
	DIVISIBLE_NINE(9),
	DIVISIBLE_NONE(0);
	
	private int value; 
	private AFLEnums(int value) { 
		this.value = value; 
	}


}
