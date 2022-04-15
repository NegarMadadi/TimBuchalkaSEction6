package org.example.sec6.inheritanceChallenge;


//Start with a base class of a Vehicle, then create a Car class that inherits from this base class.
//Finally, Create another class, a specific type of car that inherits from the Car class.
//you should be able to hand steering, changing gears, and moving (Speed in other words).
//you will want to decide where to put the appropriate estate and behaviours(fields and methods).
//As  mentioned above, changing gears , increasing/decreasing speed should be included.
//For you specific type of vehicle you will want to add something specific for that type of car.

public class Main {
    public static void main(String[] args) {
        Ford newFord = new Ford(36);
        newFord.steer(45);
        newFord.accelerate(30);
        newFord.accelerate(20);
        newFord.accelerate(-42);
    }
}
