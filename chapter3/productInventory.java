// Q4. Product Inventory
// Create a Product class with id, name, price and quantity.
// - Create 6 products.
// - Calculate the total inventory value.
// - Find the product with the highest inventory value (price * quantity).
// - Print products whose quantity is below 5.

class product{
    int id ;
    String name;
    double price;
    int quantity;
}
public class productInventory {
    public static void main(String[] args) {
        product p1 = new product();
        product p2 = new product();
        product p3 = new product();
        product p4 = new product();
        product p5 = new product();
        product p6 = new product();

        product[] pr = new product[6];
        pr[0] = p1;
        p1.id =1;
        p1.name = "headphone";
        p1.price = 500;
        p1.quantity = 837;

        pr[1] = p2;
        p2.id =2;
        p2.name = "charger";
        p2.price = 800;
        p2.quantity = 8;

        pr[2] = p3;
        p3.id =3;
        p3.name = "otg";
        p3.price = 5;
        p3.quantity = 3;

        pr[3] = p4;
        p4.id =4;
        p4.name = "cable";
        p4.price = 180;
        p4.quantity = 10;

        pr[4] = p5;
        p5.id =5;
        p5.name = "battry";
        p5.price = 700;
        p5.quantity = 20;

        pr[5] = p6;
        p6.id = 6;
        p6.name = "cover";
        p6.price = 100;
        p6.quantity = 100;

        int totalInventeryValue = 0;
        product higestInventry = pr[1];

        for(product p : pr){
            System.out.println("the id are " +p.id);
            System.out.println("the names are " +p.name);
            System.out.println("the prices are "+p.price);
            System.out.println("the quantity are " +p.quantity);
            System.out.println();

            totalInventeryValue += p.price;

            if(p.quantity < 5){
                System.out.println("the product whose quantiy is less than 5 are "+p.name);
                System.out.println();
            }

            if(higestInventry.price > p.price && higestInventry.quantity > p.quantity){
                
            }
        }

        System.out.println("The total inventery value is " +totalInventeryValue);
        System.out.println("the value of higest inventory are "+higestInventry.name);
        System.out.println("the value of higest inventory are "+higestInventry.price);
        System.out.println("the value of higest inventory are "+higestInventry.quantity);

        



    }
}
