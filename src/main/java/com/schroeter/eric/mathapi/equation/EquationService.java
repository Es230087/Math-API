package com.schroeter.eric.mathapi.equation;

import org.springframework.stereotype.Service;

@Service
public class EquationService {

    public Float process(String operation, Float valueOne, Float valueTwo) {

        Float answer = 0.0f;

        if (operation.equals("add")) {
            answer = valueOne + valueTwo;
        } else if (operation.equals("subtract")) {
            answer = valueOne - valueTwo;
        } else if (operation.equals("multiply")) {
            answer = valueOne * valueTwo;
        } else if (operation.equals("divide")) {
            answer = valueOne / valueTwo;
        }

        return answer;
    }

}
