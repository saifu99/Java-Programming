package practiceprograms;

public class PatternPrinting {
    public static void main(String[] args) {
        pattern1(); //static method
        PatternPrinting patternsKK = new PatternPrinting();
        patternsKK.pattern2(); //call the pattern
    }

    ////// Patterns Start ///////

    //solid square pattern
    static void pattern1() { //if use static then don't need to create an object
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    private void pattern2() { //right triangle pattern
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    private void pattern3() { //inverted triangle pattern
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {  //(n-i+1)
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    private void pattern4() { //number pattern
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    private void pattern5() {
        int n = 5;
        for (int i = 1; i <= 2 * n - 1; i++) {
            // int totalColInRow = i>n ? 2*n-i:i; //Lambda expressions

            int totalColInRow = 0;
            if (i > n) {
                totalColInRow = 2 * n - i;
            } else {
                totalColInRow = i;
            }


            for (int j = 1; j <= totalColInRow; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }


    private void pattern6() {
        int n = 5;
        for (int i = 1; i <= 2 * n - 1; i++) {
            int totalColInRow = i > n ? 2 * n - i : i;

            int noOfSpaces = n - totalColInRow;
            for (int s = 1; s <= noOfSpaces; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= totalColInRow; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }


    private void pattern7() {
        int n = 10;
        /// calculate n digits /////
        String a = String.valueOf(n);
        int digits = a.length();


        for (int i = 1; i <= n; i++) {
            int spaceLimit = 0;

            if (digits == 1) {
                spaceLimit = n - i;
            } else if (digits == 2) {
                /// calculate i digits /////
                String aI = String.valueOf(i);
                int iDigits = aI.length();
                if (iDigits == digits) {
                    spaceLimit = n - i;
                } else {
                    spaceLimit = n - (i - 1);
                }

            } else if (digits == 3) {
                /// calculate i digits /////
                String aI = String.valueOf(i);
                int iDigits = aI.length();
                if (iDigits == 2) {
                    spaceLimit = n - (i - 1);
                } else {
                    spaceLimit = n - (i - 2);
                }

            }


            for (int space = 0; space < spaceLimit; space++) {
                System.out.print(" ");
            }

            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}




