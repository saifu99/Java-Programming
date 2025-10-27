package basics.methodsfunctions;

public class MethodsMaster {
    static void greet() {
        System.out.println("Static Method (no parameters, no return)");
    }

    static int add(int a, int b) {
        return a + b;
    }

    // 3️⃣ METHOD OVERLOADING (same name, diff params)
    static double add(double a, double b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }

    // 4️⃣ NON-STATIC METHOD (object required)
    int multiply(int a, int b) {
        return a * b;
    }

    // 5️⃣ VARARGS METHOD (variable number of arguments)
    static double average(int... nums) {
        if (nums.length == 0) return 0;

        int sum = 0;
        for (int n : nums) sum += n;
        return (double) sum / nums.length;
    }

    // 6️⃣ RECURSIVE METHOD (calls itself)
    static int factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }

    // 7️⃣ UTILITY METHOD (calls other methods)
    void showAllExamples() {
        System.out.println("\n=== Inside showAllExamples() ===");
        System.out.println("Sum: " + add(5, 3));
        System.out.println("Sum of three: " + add(5, 3, 2));
        System.out.println("Product: " + multiply(4, 6));
        System.out.println("Average: " + average(10, 20, 30, 40));
        System.out.println("Factorial of 5: " + factorial(5));
    }

    // 8️⃣ MAIN METHOD (entry point)
    public static void main(String[] args) {

        // Static methods — can be called directly
        greet();
        System.out.println("Add (int): " + add(10, 20));
        System.out.println("Add (double): " + add(2.5, 3.5));

        // Non-static methods — need an object
        MethodsMaster obj = new MethodsMaster();
        System.out.println("Multiply: " + obj.multiply(4, 5));

        // Varargs method
        System.out.println("Average of 3, 6, 9: " + average(3, 6, 9));

        // Recursive method
        System.out.println("Factorial of 4: " + factorial(4));

        // Call utility method that uses all others
        obj.showAllExamples();
    }
}



