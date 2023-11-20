package com.oops.Inheritence;

public class MountainBike extends Bicycle{

    int startHeight;
    public MountainBike(int gear, int speed, int startHeight) {
        super(gear, speed);
        this.startHeight = startHeight;
    }

}
