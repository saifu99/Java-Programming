package practiceprograms;

public class FibonacciSeries {
    public static void main(String[] args) {
        fibonacci(5);
    }

     static void fibonacci(int n) {
        int firstTerm = 0, secondTerm = 1;

        System.out.println("Fibonacci Series up to " + n + " terms:");
        for (int i = 1; i <= n; i++) {
            System.out.print(firstTerm + " ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}


//method two
//public class FibonacciSeries {
//    public static void main(String[] args) {
//        int result = fib(5);
//        System.out.println("5th Fibonacci number is: " + result);
//    }
//
//    static int fib(int n) {
//        if (n == 1) {
//            return 0;
//        } else if (n == 2) {
//            return 1;
//        } else {
//            return fib(n - 1) + fib(n - 2);
//        }
//    }
//}
