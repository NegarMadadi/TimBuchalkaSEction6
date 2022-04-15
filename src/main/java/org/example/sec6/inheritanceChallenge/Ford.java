package org.example.sec6.inheritanceChallenge;

public class Ford extends Car {
    private int roadServiceMonth;

    public Ford(int roadServiceMonth) {
        super("Ford", "Focus", 4, 4, 6, false);
        this.roadServiceMonth = roadServiceMonth;
    }

    public void accelerate(int rate) {
        int newVelocity = getCurrentVelocity() + rate;
        if (newVelocity == 0) {
            stop();
            changetGear(1);
        } else if (newVelocity > 0 && newVelocity <= 10) {
            changetGear(1);
        } else if (newVelocity > 0 && newVelocity <= 10) {
            changetGear(1);

        } else if (newVelocity > 10 && newVelocity <= 20) {
            changetGear(2);
        } else if (newVelocity > 20 && newVelocity <= 30) {
            changetGear(3);
        } else {
            changetGear(4);
        }

        if (newVelocity > 0) {
            changeVelocity(newVelocity, getCurrentDirection());
        }
    }
}
