// Q8. Null object reference
// Create an object reference with null. Try accessing its instance variable. Observe the exception.


class student{
    String name =" rahul";
}
public class nullObjectReference {
    public static void main(String[] args){
        student obj1 = null;

        System.out.println(obj1.name);
        
    }
}
