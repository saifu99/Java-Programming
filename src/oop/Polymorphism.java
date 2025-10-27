package oop;

class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a circle");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Shape s = new Circle(); // reference of parent, object of child
        s.draw(); // runtime polymorphism
    }
}
