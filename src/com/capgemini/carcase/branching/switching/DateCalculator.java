package com.capgemini.carcase.branching.switching;

public class DateCalculator {
    public int getDaysOfMonth(int numOfMonth){
        switch (numOfMonth){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return 29;
            default:
                return -1;
        }
    }
}
