package com.schroeter.eric.mathapi.equation;

public class EquationRequest {

    public String operation;

    public Float valueOne;
    public Float valueTwo;

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public Float getValueOne() {
        return valueOne;
    }

    public void setValueOne(Float valueOne) {
        this.valueOne = valueOne;
    }

    public Float getValueTwo() {
        return valueTwo;
    }

    public void setValueTwo(Float valueTwo) {
        this.valueTwo = valueTwo;
    }
}
