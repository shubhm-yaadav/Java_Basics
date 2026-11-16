// Q6. Reference reassignment
// - Create two objects of a Car class.
// - Create two reference variables.
// - Assign each reference to a different object.
// - Reassign the first reference to the second object.
// - Print the information using both references.

class car{
    String brand = "omni";
}
public class referenceReassingment {
    public static void main(String[] args) {
        car c1 = new car();
        car c2 = new car();

        System.out.println(c1.brand);
        System.out.println(c2.brand);
    }
}
