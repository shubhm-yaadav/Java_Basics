// Q6. Assigning one reference to another
// - Create a Student class with name and age.
// - Create one Student object.
// - Create another reference variable.
// - Assign the first reference to the second.
// - Change the name using the second reference.
// - Print the name using both references.
class student {
    String name;
    int age;
}

public class assignOneReferenceToAnother {
    public static void main(String[] args){
        student s1 = new student();
        s1.name = "shubham";
        student s2 = s1;
        s2.name = "rahul";

        System.out.println(s1.name);
        System.out.println(s2.name);
    }
}
