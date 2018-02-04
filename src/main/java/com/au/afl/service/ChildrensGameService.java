package com.au.afl.service;

import com.au.afl.exception.AFLException;

public interface ChildrensGameService {
    public int gameExecution(int totalChildren, int runningNumber) throws AFLException;
}
