package org.medron.volumeII.chapter8.test;

public abstract class Bird implements Flyable {
    @Override
    public void rise() {
        System.out.println("Bird rising");
    }

    @Override
    public void fly() {
        System.out.println("Bird flying");

    }

    @Override
    public void a() {
        System.out.println("Bird a");
    }
}
