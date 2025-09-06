package com.praj.solidp.openclosed;

public class BadCalculator {
//     This is bad design where we are taking type and for each type we are having cases
//     now if we want to introduce division, we have to modify calculator

    public int calculatorNumber(int num1, int num2 , String type) {
        int result = 0;
        switch(type) {
            case "sum":
                result = num1 + num2;
            case "sub":
                result = num1 - num2;
        }
        return result;
    }
}
