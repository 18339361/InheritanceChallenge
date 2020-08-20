package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Car newCar= new Car(1);
        System.out.println(("New Car Made"));
        newCar.changingGears();
        newCar.move();
        System.out.println(newCar.getHandsteering());
        newCar.stop();
        System.out.println("\n*****************************************\n");

        Ferrari newFerrari= new Ferrari(3, "red");
        System.out.println(("Ferrari Made"));
        newFerrari.getColour();
        System.out.println(newFerrari.getHandsteering());
        newFerrari.changingGears();
        newFerrari.move();
        newFerrari.stop();
    }
}
