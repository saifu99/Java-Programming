package oop;

interface Animal2 {
    void sound(); // implicitly public + abstract
}

class Cat implements Animal2 {
    public void sound() {
        System.out.println("Meow");
    }
}

public class Interface {
    public static void main(String[] args) {
        Animal2 a = new Cat();
        a.sound();
    }
}
