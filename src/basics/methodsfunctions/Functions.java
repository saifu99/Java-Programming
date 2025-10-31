package basics.methodsfunctions;
import java.util.Scanner;

public class Functions {
     static void printMyName(String name) {
        System.out.println("name = "+name);
    }

     static int calculateSum(int a, int b){
        int sum = a + b;
        return sum;
    }

    public static void printFactorial(int n){
        if (n<0){
            System.out.println("invalid number");
            return;
        }
            int factorial = 1;
        for (int i=n; i>=1; i--){
            factorial=factorial*i;
        }
        System.out.println("factorial = "+factorial);
    }

    static int printAverage(int x, int y, int z) {
        int average = (x + y + z) / 3;
        return average;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Print Name
        System.out.print("enter your name: ");
        String name = sc.next();
        printMyName(name);

        //Sum of Two Numbers
        System.out.print("enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("sum = " + calculateSum(a, b));

        //Factorial
        System.out.print("enter a number: ");
        int n = sc.nextInt();
        printFactorial(n);

        //Average of Three Numbers
        System.out.print("enter three numbers: ");
        int x = sc.nextInt(), y = sc.nextInt(), z = sc.nextInt();
        int Average = printAverage(x, y, z);
        System.out.println("average = " + Average);
        sc.close();
    }
}



