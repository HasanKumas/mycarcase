package com.capgemini.carcase.branching.switching;

public class AssignmentSwitch {
    public static void main(String[] args) {
        int monthNum = 2;
        DateCalculator d = new DateCalculator();
        System.out.println(d.getDaysOfMonth(monthNum));
    }
}
