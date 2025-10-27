package exceptionhandling;

public class ThrowKeyword {
    static void validateAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("access denied - underage");
        } else {
            System.out.println("access granted");
        }
    }

    public static void main(String[] args) {
        validateAge(16);
        System.out.println("end of program");
    }
}

