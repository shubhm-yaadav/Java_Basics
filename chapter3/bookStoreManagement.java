// Q5. Book Store Management
// Create a Book class with bookId, title, author and price.
// - Create 6 book objects.
// - Search for a book using its bookId.
// - Find the most expensive and cheapest books.
// - Print all books written by a particular author.

import java.util.Scanner;

class book{
    int bookid;
    String title;
    String author;
    int price;
}
public class bookStoreManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        book[] bk = new book[3];

        bk[0] = new book();
        bk[0].bookid = 1;
        bk[0].title = "october junction";
        bk[0].author = "dubey ji";
        bk[0].price = 200;

        bk[1] = new book();
        bk[1].bookid = 2;
        bk[1].title = "musfir cafe";
        bk[1].author = "dubey ji";
        bk[1].price = 200;

        bk[2] = new book();
        bk[2].bookid = 3;
        bk[2].title = "gunho ke dewta";
        bk[2].author = "divya prakash bharti";
        bk[2].price = 240;

        System.out.print("Enter the id 1 to 3 -: " );
        int searchId = sc.nextInt();
        book expensive = bk[0];
        book chepest = bk[0];

        for(book br : bk){

            //search for book using bookid....
            if (searchId == br.bookid ){
                System.out.println("name of the book is " + br.title);
                System.out.println("author of the book is " + br.author);
                System.out.println("price of the book is " + br.price);
                System.out.println();
            }

            // the biggest on is
            if (expensive.price > br.price){
                expensive = br;
                System.out.println("the most expensive book is "+ expensive.title);
            }
            //chepest book is 
            if (chepest.price < br.price){
                chepest = br;
                System.out.println("the most chepest book is "+ chepest.title);
            }
        }
        // System.out.println("the most expensive book is "+ expensive.title);
        // System.out.println("the most chepest book is "+ chepest.title);
       
        sc.close();
    }
    
}
