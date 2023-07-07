package org.medron.volumeII.chapter8.test;

public class Owl extends Bird{
    void owl(){
        System.out.println("Owl default");
    }
    @Override
    public void fly() {
        System.out.println("Owl rising.");
    }

    @Override
    public void a() {
        System.out.println("Owl a");
    }
}
