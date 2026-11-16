// Q15. Real-world object design

// Create a class named Product.
// - Instance variables: productName, productId, price, quantity.
// - Create four product objects.
// - Assign different values.
// - Print all product details.
// - Find the product with the highest price.
class product{
    String productName;
    int productId;
    int price;
    int quantity;
}
public class realWorldObjectDesign {
    public static void main(String[] args) {
        product p1 = new product();
        p1.productName = "shope";
        p1.productId = 1;
        p1.price = 20;
        p1.quantity  = 30;

        product p2 = new product();
        p2.productName = "pencil";
        p2.productId = 2;
        p2.price = 5;
        p2.quantity  = 50;

        product p3 = new product();
        p3.productName = "pen";
        p3.productId = 3;
        p3.price = 6;
        p3.quantity  = 35;

        product p4 = new product();
        p4.productName = "eraser";
        p4.productId = 4;
        p4.price = 2;
        p4.quantity  = 10;

        product[] p = {p1,p2,p3,p4};

        for (product pro : p){
            System.out.println(pro.productName);
            System.out.println(pro.productId);
            System.out.println(pro.price);
            System.out.println(pro.quantity);

            System.out.println("------------------");
        }

         product higestPrice = p[0];
         
        for (product higest : p ){
            if (higest.price > higestPrice.price){
                higestPrice = higest;
            }
        }
        System.out.println("higest price product is ......");
        System.out.println("productName is " + higestPrice.productName);
        System.out.println("productName is " + higestPrice.productId);
        System.out.println("productName is " + higestPrice.price);
        System.out.println("productName is " + higestPrice.quantity);
        
    }
}
