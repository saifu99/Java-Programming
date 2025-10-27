package basics;
import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of a: ");
        int a = sc.nextInt();

        sc = new Scanner(System.in);
        System.out.print("enter the value of b: ");
        int b = sc.nextInt();

        System.out.println("sum is: " + (a+b));
    }
}
