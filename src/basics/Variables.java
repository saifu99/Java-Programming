package basics;

public class Variables {
    int instanceVar = 10;
    static int staticVar = 20;

    public static void main(String[] args) {
        int localVar = 5;

        Variables obj = new Variables();

        System.out.println("local Variable: " + localVar);
        System.out.println("instance Variable: " + obj.instanceVar);
        System.out.println("static Variable: " + Variables.staticVar);

        obj.instanceVar = 15;
        Variables.staticVar = 25;

        System.out.println("\nAfter Modification:");
        System.out.println("Instance Variable (obj): " + obj.instanceVar);
        System.out.println("Static Variable (shared): " + Variables.staticVar);
    }
}
