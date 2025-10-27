package basics.controlflow;
import java.util.Scanner;

public class ConditionalStatements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the age: ");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("Adult");
        } else {
            System.out.println("not adult");
        }

//check for even or odd
        System.out.print("enter a number to check even/odd: ");
        int x = sc.nextInt();
        if (x % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }

//else if condition
        System.out.print("enter first number: ");
        int a = sc.nextInt();
        System.out.print("enter second number: ");
        int b = sc.nextInt();

        if (a == b) {
            System.out.println("equal");
        } else if (a > b) {
            System.out.println("a is greater");
        } else {
            System.out.println("a is lesser");
        }

//switch condition
        System.out.print("enter the button to test switch case: ");
        int button = sc.nextInt();
        switch (button){
            case 1 :
                System.out.println("Hello");
                break;
            case 2 :
                System.out.println("Good afternoon");
                break;
            case 3 :
                System.out.println("Bonjour");
                break;
            default:
                System.out.println("Invalid button");
        }
        sc.close();
    }
}
