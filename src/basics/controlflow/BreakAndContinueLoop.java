package basics.controlflow;

public class BreakAndContinueLoop {
    public static void main(String[] args) {
        breakExample();
        continueExample();
    }

        static void breakExample(){
        System.out.println("break example:");
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            System.out.println("Java is great");
            if (i == 2) {
                System.out.println("ending the loop");
                break;
            }
            System.out.println("loop ends here");
        }
    }

    static void continueExample(){
        System.out.println("continue example:");
        for (int i=0; i<=5; i++){
            if(i==2){
                System.out.println("ending the loop");
                continue;
            }
            System.out.println(i);
            System.out.println("Java is great");
        }
    }
}
