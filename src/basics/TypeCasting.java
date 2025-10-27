package basics;

public class TypeCasting {
    static void main(String[] args) {
        int x = 10;
        double y = x; //implicit

        double a = 9.78;
        int b = (int) a; //explicit
        System.out.println("implicit casting (int to double): " + y);
        System.out.println("explicit casting (double to int): " + b);
    }
}

