// 1. Create an object: Create a Student class with name and age variables. Create an object and assign values to its variables. Print them.


class Student{
    String name;
    int age;    
}
public class createAnObject {
    public static void main(String[] args){
       Student myStudent1 = new Student();
       myStudent1.name = "shubham"; 
       myStudent1.age = 26;

       Student myStudent2 = new Student();
       myStudent2.name = "Rohit";
       myStudent2.age = 26;


       System.out.println(myStudent2.name);
       System.out.println(myStudent2.age);

       Mobile mymobile = new Mobile();
       System.out.println(mymobile.brand);
       System.out.println(mymobile.price);
       System.out.println(mymobile.isavliable);

    }
}

// Q3>.Object independence: Create two Dog objects. Change the name of the first object. Print the names of both objects
class Mobile{
 int price;
 String brand;
 boolean isavliable;
}