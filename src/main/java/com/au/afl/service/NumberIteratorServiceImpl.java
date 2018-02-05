package com.au.afl.service;

import com.au.afl.constant.AFLConstants;
import com.au.afl.enums.AFLEnums;
import com.au.afl.exception.AFLException;
import com.au.afl.util.AFLUtil;

public class NumberIteratorServiceImpl implements NumberIteratorService{


    /**
     * This is the service that will execute the number
     * iterator
     * @throws AFLException
     */
    @Override
    public StringBuilder executeNumberIterator(int integersLength, int firstNumber, int secondNumber) throws AFLException {

        StringBuilder resultMessage;
        try {
            resultMessage = new StringBuilder();
            for(int iNext = 1; iNext <= integersLength; iNext++){

                AFLEnums firstDivisible = AFLUtil.validateNumber(firstNumber, iNext);
                AFLEnums secondDivisible = AFLUtil.validateNumber(secondNumber, iNext);

                if(firstDivisible.equals(AFLEnums.DIVISIBLE_TRUE)
                        && secondDivisible.equals(AFLEnums.DIVISIBLE_TRUE)) {
                    resultMessage.append(iNext + AFLConstants.BAZ_MESSAGE + "\n");
                }else if(firstDivisible.equals(AFLEnums.DIVISIBLE_TRUE)){
                    resultMessage.append(iNext + AFLConstants.FOO_MESSAGE + "\n");
                }else if(secondDivisible.equals(AFLEnums.DIVISIBLE_TRUE)){
                    resultMessage.append(iNext + AFLConstants.BAR_MESSAGE + "\n");
                }else{
                    resultMessage.append(iNext + "\n");
                }
            }
        } catch (Exception e) {
            throw new AFLException("The system encountered error");
        }
        return resultMessage;
    }
}
