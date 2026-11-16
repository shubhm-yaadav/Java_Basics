// Q3. Object Reference Tracking
// Create a Laptop class with brand, price and RAM.
// - Create 3 Laptop objects.
// - Create multiple references pointing to the same object.
// - Modify the price using one reference.
// - Assign one reference to another object.
// - Print all references and explain which references point to the same object.

class laptop{
    String brand ;
    int price;
    int ram;
}
public class objextReferenceTrakings {
    public static void main(String[] args) {
       laptop l1 = new laptop();
       laptop l2 = new laptop();
       laptop l3 = new laptop();

       l1.brand = "asus";
       l1.price = 45678;
       l1.ram = 32;

       l2.brand = "dell";
       l2.price = 83659;
       l2.ram = 16;

       l3.brand = "msi";
       l3.price = 387539;
       l3.ram  = 8;

       laptop l4 = l2;
       laptop l5 = l2;

       l5.price = 3736539;
       
       l5 = l1;

       System.out.println(l5.price);
       
       System.out.println(l1 == l5);
       System.out.println(l2 == l5);

    }
}
