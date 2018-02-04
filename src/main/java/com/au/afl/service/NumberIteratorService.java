package com.au.afl.service;

import com.au.afl.exception.AFLException;

public interface NumberIteratorService {
	public StringBuilder executeNumberIterator(int integersLength, int firstNumber, int secondNumber) throws AFLException;
}
