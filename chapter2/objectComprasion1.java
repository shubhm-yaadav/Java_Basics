// Object comparison
// - Create two objects of a Student class.
// - Give both objects the same name and age.
// - Compare them using ==.
// - Now assign the first object's reference to another variable.
// - Compare the references again.

class student {
    String name;
    int age;
}
public class objectComprasion1 {
    public static void main(String[] args) {
        student s1 = new student();
        s1.name = "shubham";
        s1.age = 26;
        student s2 = new student();
        s2.name = "shubham";
        s2.age = 26;

        System.out.println(s1.name == s2.name);
        System.out.println(s2.age == s2.age);
    }
}
