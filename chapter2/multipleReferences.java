// Q4. Multiple references
// Create three object references pointing to the same object. Modify the object's data using each reference and observe the result.
 class student {
    String name;

 }
public class multipleReferences {
    public static void main(String[] args){
        student s1 = new student();

        student obj1 = s1;
        student obj2 = s1;
        student obj3 = s1;

        obj2.name = "rahul";

        System.out.println(obj3.name);

        obj3.name = "rohan";
        System.out.println(s1.name);
        
    }
}
