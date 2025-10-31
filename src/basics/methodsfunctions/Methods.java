package basics.methodsfunctions;

public class Methods {
    //static method
    static void greet() {
        System.out.println("this is Static Method - (no parameters, no return)");
    }

    static int add(int a, int b) {
        return a + b;
    }

    //non-static method
    int multiply(int x, int y) {
        return x * y;
    }

    public static void main(String[] args) {
        greet();
        System.out.println("sum = " + add(10, 20));

        //instance method call (object required)
        Methods obj = new Methods();
        int product = obj.multiply(4,5);
        System.out.println("product = " + product);
    }
}





