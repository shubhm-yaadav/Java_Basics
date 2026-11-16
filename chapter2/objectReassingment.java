// Q5. Object reassignment
// Create two objects, obj1 and obj2. Assign obj2 to obj1. Change the object's data using obj1. Check what happens when you access it through obj2.


class student{
    String name = "rahul";

}
public class objectReassingment {
    public static void main(String[] args){
        student obj1 = new student();
        student obj2 = obj1;

        obj1.name ="shubham";

        System.out.println(obj2.name);
    }
}
