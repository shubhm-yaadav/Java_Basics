// Q6. Object comparison
// Create two objects of the same class with identical variable values. Compare them using ==. Observe the result.

class student{
    String name ="shubham";
}
public class objectComparison {
    public static void main(String[] args){
        student obj1 = new student();
        student obj2 = new student();

        System.out.println(obj1 == obj2);

        // if (obj1 == obj2){
        //     System.out.println(obj1.name);
        //     System.out.println(obj2.name);
        // }else{
        //     System.out.println("they are not the same");
        // }

    }
}
