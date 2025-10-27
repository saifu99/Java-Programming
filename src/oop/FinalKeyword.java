package oop;

final class Constants {
    static final double PI = 3.14159;
}

// final prevents inheritance
public class FinalKeyword {
    public static void main(String[] args) {
        System.out.println("Value of PI: " + Constants.PI);
    }
}
