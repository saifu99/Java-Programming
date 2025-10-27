package exceptionhandling;

public class MultipleCatch {
    public static void main(String[] args) {
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]); //ArrayIndexOutOfBoundsException
        } catch (ArithmeticException e) {
            System.out.println("arithmetic error");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("array index error");
        } catch (Exception e) {
            System.out.println("general error: " + e.getMessage());
        }
    }
}

