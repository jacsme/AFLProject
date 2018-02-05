package com.au.afl.enums;

public enum AFLEnums {

    DIVISIBLE_TRUE(true),
    DIVISIBLE_FALSE(false);

    private boolean value;
    private AFLEnums(boolean value) {
        this.value = value;
    }


}
