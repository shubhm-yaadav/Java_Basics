// Q10. Null reference
// - Create a reference variable of type Student without creating an object.
// - Print its value.
// - Try accessing its instance variable.
// - Observe the result.
// - Now create an object and assign it to that reference.
class student {
    String name ="shubham";
}
public class nullReference {
    public static void main(String[] args) {
        student s1 = null ;
         System.out.println(s1);

         s1 = new student();
         System.out.println(s1.name);
    }
}
