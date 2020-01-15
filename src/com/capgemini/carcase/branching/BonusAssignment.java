package com.capgemini.carcase.branching;

public class BonusAssignment {
    public static void main(String[] args) {
        Car car = new Car();
        double mileage = car.getMileage();
        if (mileage> 100000){
            System.out.println("the car used a lot...");
        }
        else {
            System.out.println("Not used a lot..");
        }
    }
}
