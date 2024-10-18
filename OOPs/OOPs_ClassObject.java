class Employee{
    int id;
    String name;
    public void printDetails(){
        System.out.println("My id is " + id);
        System.out.println("and my name is " + name);
    }
}
public class OOPs_ClassObject {
    public static void main(String[] args) {
        System.out.println("This is our custom class");

        Employee harry = new Employee();
        Employee john = new Employee();

        //setting attributes
        harry.id = 20;
        harry.name = "CodeWithHarry";

        john.id=24;
        john.name="John Goel";

        //printing attributes
//        System.out.println(harry.id);
//        System.out.println(harry.name);
        harry.printDetails();
        john.printDetails();
    }
}


//class A1{
//int a = 10;
//String b = "Saifu";
//
//void show() {
//    System.out.println(a + " " + b);
//}
//}
//class test{
//    public static void main(String[] args) {
//        A1 ref = new A1();                        //Object
//        ref.show();
//    }
//}