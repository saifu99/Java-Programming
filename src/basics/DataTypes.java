package basics;

public class DataTypes {
    public static void main(String[] args) {

        // ----------- PRIMITIVE DATA TYPES -----------
        //Integer types
        byte b = 10;              // 1 byte  -> range: -128 to 127
        short s = 200;            // 2 bytes -> range: -32,768 to 32,767
        int i = 50000;            // 4 bytes -> commonly used for integers
        long l = 9000000000L;     // 8 bytes -> note 'L' suffix for long literals

        //Floating-point types
        float f = 5.75f;          // 4 bytes -> requires 'f' or 'F' suffix
        double d = 19.99;         // 8 bytes -> more precise, default for decimals

        //Character type
        char ch = 'A';            // 2 bytes -> stores a single Unicode character

        //Boolean type
        boolean isJavaFun = true; // 1 bit (logical value true/false)

        // ----------- NON-PRIMITIVE DATA TYPES -----------
        //String (class type)
        String name = "Saifu";    // Strings are objects (not primitive)

        //Arrays
        int[] numbers = {10, 20, 30, 40};

        //Wrapper classes (Objects for primitives)
        Integer numObj = 100;     //Autoboxing: primitive → object
        Double dblObj = 55.66;


        // ----------- OUTPUT -----------
        System.out.println("---- PRIMITIVE DATA TYPES ----");
        System.out.println("boolean: " + isJavaFun);

        System.out.println("\n---- NON-PRIMITIVE DATA TYPES ----");
        System.out.println("String: " + name);
        System.out.print("Array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("Integer object: " + numObj);
        System.out.println("Double object: " + dblObj);
    }
}

