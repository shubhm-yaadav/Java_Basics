// Q2. Independent objects
// Create two objects of the same class. Change an instance variable in the first object. Verify that the second object's variable remains unchanged.
class student {
    String name;
    
}

public class independentObject {
    public static void main(String[] args){
        
        student student1 = new student();
        student student2 = new student();
    
        student1.name = "rohan";
        student2.name = "rahul";
        student1.name = "rohit";

        System.out.println(student1.name);
        System.out.println(student2.name);
    }
    
}
