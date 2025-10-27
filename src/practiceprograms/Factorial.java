package practiceprograms;

public class Factorial {
    public static void main(String[] args) {
        int n = 5;

        System.out.println("factorial of " + n + " (recursive): " + factorialRecursive(n));
        System.out.println("factorial of " + n + " (iterative): " + factorialIterative(n));
    }

    static int factorialRecursive(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorialRecursive(n - 1);
        }
    }

    static int factorialIterative(int n) {
        int product = 1;
        for (int i = 1; i <= n; i++) {
            product *= i;
        }
        return product;
    }
}

