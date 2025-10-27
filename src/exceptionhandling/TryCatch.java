package exceptionhandling;

public class TryCatch {
    public static void main(String[] args) {
        try {
            int result = 10/0; // will cause ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: can't divide by zero");
        }
        System.out.println("program continues...");
    }
}
