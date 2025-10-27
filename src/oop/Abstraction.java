package oop;

abstract class Vehicle {
    abstract void start(); // abstract method = no body

    void stop() {
        System.out.println("Vehicle stopped.");
    }
}

class Bike extends Vehicle {
    void start() {
        System.out.println("Bike started.");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Vehicle v = new Bike();
        v.start();
        v.stop();
    }
}

