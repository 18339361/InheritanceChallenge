package com.company;

public class Car extends Vehicle {
    private int handSteering;

    public Car(int handsteering){
        this.handSteering= handsteering;
    }

    public void changingGears(){
        System.out.println("Gear changed");
    }

    public int getHandsteering(){
        return this.handSteering;
    }

    @Override
    public void move(){
        System.out.println("Car is moving");
        super.move();
    }

    @Override
    public void stop(){
        System.out.println("Car is stopping");
        super.stop();
    }
}
