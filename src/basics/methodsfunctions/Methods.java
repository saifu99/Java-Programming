package basics.methodsfunctions;

public class Methods {
    //static method
    static int add(int a, int b) {
        return a + b;
    }

    //non-static method
    int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        int sum = add(5, 3);
        System.out.println("sum = " + sum);

        //instance method call
        Methods obj = new Methods();
        int product = obj.multiply(5, 3);
        System.out.println("product = " + product);
    }
}

