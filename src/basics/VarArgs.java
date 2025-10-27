package basics;

public class VarArgs {
    static int sum(int ...arr){
        int result=0;
        for(int a:arr){
            result += a;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("welcome to VariableArguments tutorial:");
        System.out.println("sum of nothing is: " + sum());
        System.out.println("sum of 4 and 3 is: " + sum(1,2));
        System.out.println("sum of 4 and 3 and 2 is: " + sum(1,2,3));
        System.out.println("sum of 4 and 3 and 2 and 1 is: " + sum(1,2,3,4));
    }
}
