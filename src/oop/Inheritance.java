package oop;

class Animal {
    void sound() {
        System.out.println("Some sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Bark");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound(); // inherited + overridden
    }
}
