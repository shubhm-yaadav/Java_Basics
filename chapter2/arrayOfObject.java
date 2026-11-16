// Q10. Array of objects
// - Create a class named Laptop.
// - Declare brand, ram, and price.
// - Create an array capable of holding 3 Laptop references.
// - Create three separate objects using new.
// - Store them in the array.
// - Print all details using a loop.
class laptop{
    String Brand;
    int RAM;
    int Price;
}
public class arrayOfObject {
    public static void main(String[] args) {
         laptop[] arr = new laptop[3]; 
         arr[0] = new laptop();
         arr[0].Brand = "asus";
         arr[0].RAM = 12;

         arr[1] = new laptop();
         arr[1].Brand = "Dell";
         arr[2] = new laptop();

         for (laptop print : arr){
            System.out.println(print.Brand);
            System.out.println(print.RAM);
         }
    }
}
