// Q1. Object creation
// Create a class Student. Create three objects of this class and assign different values to their instance variables. Print their values.


class student{
    String name;
}
public class objectCreation {
    public static void main(String[] args) {
        
        student student1 = new student();
        student student2 = new student();
        student student3 = new student();

        student1.name = "rohan";
        student2.name = "rahul";
        student3.name = "ram";

        System.out.println(student1.name);
        System.out.println(student2.name);
        System.out.println(student3.name);
        
    }
}
