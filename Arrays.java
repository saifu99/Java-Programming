import java.io.OptionalDataException;

public class Arrays {
    public static void main(String[] args) {
       Arrays arr = new Arrays();
        arr.array1();
        //forEachLoop();
    }

    private void array2() {
    }

    static void array1() {
        int[] marks = {10, 25, 36, 50, 59};
        System.out.println(marks.length);
    }


    static void array2(int i) {
        //prinnting using Naive method
        int[] marks = {10, 41, 22, 14};
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);

        System.out.println("print using for loop ");
        for (i = 0; i < marks.length; i++) ;
        System.out.println(marks[i]);
    }

    //System.out.println("print using for loop in reverse order");
    //private OptionalDataException marks;
//    for(int i = marks.length - 1; i>=0; i--){
//        //boolean[] marks = new boolean[0];
//        System.out.println(marks[i]);
//    }
//}


    static void forEachLoop() {
        int[] marks = {10, 41, 22, 14, 15};
        System.out.println("print using for each loop");
        for(int element: marks ){
            System.out.println(element);
        }
    }
}







