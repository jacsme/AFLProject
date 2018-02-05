package com.au.afl.constant;

public class TestConstantsResult {

    public static StringBuilder setResultMessageOddNumber(){
        StringBuilder resultMessage = new StringBuilder();
        resultMessage.append("1\n");
        resultMessage.append("2\n");
        resultMessage.append("3FOO\n");
        resultMessage.append("4\n");
        resultMessage.append("5BAR\n");
        resultMessage.append("6FOO\n");
        resultMessage.append("7\n");
        resultMessage.append("8\n");
        resultMessage.append("9FOO\n");
        resultMessage.append("10BAR\n");
        return resultMessage;
    }
    
    public static StringBuilder setResultMessageEvenNumber(){
        StringBuilder resultMessage = new StringBuilder();
        resultMessage.append("1\n");
        resultMessage.append("2FOO\n");
        resultMessage.append("3\n");
        resultMessage.append("4BAZ\n");
        resultMessage.append("5\n");
        resultMessage.append("6FOO\n");
        resultMessage.append("7\n");
        resultMessage.append("8BAZ\n");
        resultMessage.append("9\n");
        resultMessage.append("10FOO\n");
        return resultMessage;
    }
}
