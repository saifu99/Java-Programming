package exceptionhandling;

//step 1: create your own exception by extending Exception
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class CustomException {
    static void registerUser(int age) throws InvalidAgeException {
        if (age < 18)
            throw new InvalidAgeException("user is underage");
        else
            System.out.println("registration successful!");
    }

    public static void main(String[] args) {
        try {
            registerUser(15);
        } catch (InvalidAgeException e) {
            System.out.println("exception caught: " + e.getMessage());
        }
    }
}
