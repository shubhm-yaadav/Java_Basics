// . Multiple references
// - Create a Car object.
// - Create three reference variables pointing to the same object.
// - Change its color using the third reference.
// - Print the color using all three references.

class car{
    String color = "red";
}
public class multipleReference {
    public static void main(String[] args) {
        car c1 = new car();
        car c2 = new car();
        car c3 = new car();

        c3.color = "yellow";

        System.out.println(c1.color);
        System.out.println(c2.color);
        System.out.println(c3.color);

    }
}
