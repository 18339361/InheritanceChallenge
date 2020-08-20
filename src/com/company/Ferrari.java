package com.company;

public class Ferrari extends Car {
    private String colour;

    public Ferrari(int handsteering, String colour){
        super(handsteering);
        this.colour= colour;
    }

    public void getColour(){
        System.out.println("Colour is " + this.colour);
    }

    @Override
    public void move(){
        System.out.println("Ferrari moves fassstttttttttttttttt");
        super.move();
    }
}
