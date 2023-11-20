package com.oops.Inheritence;

public class InheritenceDemo {

    public static void main(String args[]) {
        MountainBike mb = new MountainBike(20,30,20);
        int sp = mb.speedUp(8);

        System.out.println("Speed Up " +sp);
    }
}
