package basics.controlflow;

public class Loops {
    public static void main(String[] args){
        System.out.println("For Loop:");
        for (int i=0;i<10;i++) {
            System.out.println(i);
        }

        System.out.println("\nWhile Loop:");
        int j = 2;
        while (j <= 20) {
            System.out.println(j);
            j = j + 2;
        }

        System.out.println("\nDo-While Loop:");
        int k = 0;
        do {
            System.out.println(k);
            k++;
        } while (k <= 5);
    }
}
