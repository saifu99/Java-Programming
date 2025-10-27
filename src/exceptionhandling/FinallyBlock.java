package exceptionhandling;

public class FinallyBlock {
    public static void main(String[] args) {
        try {
            int a = 10 / 2;
            System.out.println("result: " + a);
        } catch (Exception e) {
            System.out.println("something went wrong");
        } finally {
            System.out.println("Finally block always runs");
        }
    }
}
