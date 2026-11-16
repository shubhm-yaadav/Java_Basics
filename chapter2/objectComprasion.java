// Q8. Object comparison
// - Create two objects of a Student class.
// - Give both objects the same name and age.
// - Compare them using ==.
// - Print the result.
// - Now assign the first object reference to another variable and compare again.

class student{
    String name ;
    int roll ;

}
public class objectComprasion {
    public static void main(String[] args){
        student s1 = new student();
        student s2 = new student();
        s1.name = "shubham";
        s2.name = "shubham";

        if(s1.name == s2.name){
            System.out.println("both are same");
        }

        s1 = s2;
        if (s1.name == s2.name) {
            System.out.println("both are same again");`
        }




    }
}
