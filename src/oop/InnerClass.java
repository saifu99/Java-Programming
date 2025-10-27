package oop;

public class InnerClass {
    private String message = "Hello from outer class!";

    class Inner {
        void show() {
            System.out.println(message); // can access outer class members
        }
    }

    public static void main(String[] args) {
        InnerClass outer = new InnerClass();
        InnerClass.Inner inner = outer.new Inner();
        inner.show();
    }
}

