// Q3. Object references
// Create an object obj1. Assign its reference to obj2. Change a variable through obj2. Print the variable through obj1

class student{
    String name = "rohan";
}
public class objectReferences {
    public static void main (String[] args){
        student obj1 = new student();
        student obj2 = obj1; //this is the correct way

        // obj1 = obj2; this can also run.

        obj2.name = "rahul";

        System.out.println(obj1.name);

    }
    
}
