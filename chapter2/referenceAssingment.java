// Q5. Reference assignment

// Create a Student object named s1.
// - Assign a name and age.
// - Create another reference variable s2.
// - Assign s1 to s2.
// - Change the student's age using s2.
// - Print the age using both references.

class Student{
    String name;
    int age;
}
public class referenceAssingment {
    public static void main (String[] args){
        Student s1 = new Student();
        s1.name = "rohit";
        s1.age = 25;
        System.out.println("befor s2 "+s1.name);
        
        Student s2 = s1;
        s2.name = "rahul";

        System.out.println(s2.name);
        System.out.println("after s2 "+ s1.name);

    }
}
