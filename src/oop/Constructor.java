package oop;

class Car {
    String brand;
    int year;

    // Constructor — runs automatically when object is created
    Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    void start() {
        System.out.println(brand + " (" + year + ") is starting...");
    }
}

public class Constructor {
    public static void main(String[] args) {
        // Object creation with constructor
        Car car1 = new Car("Swift", 2024);
        Car car2 = new Car("BMW", 2023);

        car1.start();
        car2.start();
    }
}

