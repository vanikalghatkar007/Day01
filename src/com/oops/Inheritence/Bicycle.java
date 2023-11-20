package com.oops.Inheritence;

public class Bicycle {
    protected int gear;
    protected int speed;

    public Bicycle (int gear, int speed) {
        this.gear=gear;
        this.speed=speed;
    }

    public void setGear(int val) {
        gear=val;
    }

    public int speedUp(int increment){
       return speed += increment;
    }
}
