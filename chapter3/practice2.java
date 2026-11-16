// 4. Null Checking

// Create an array of 5 Book objects.

// Initialize only first 3 objects.

// Use loop and print:

// "Empty" if element is null
// otherwise print book name.


public class practice2 {
    String name;

public static void main(String[] args) {
    practice2[] books = new practice2[5];

    books[0] = new practice2();
    books[1] = new practice2();
    books[2] = new practice2();
    books[3] = new practice2();
    books[4] = new practice2();

    books[0].name = "godan";
    books[2].name = "Diwar me ek khidki thi";

    int x = 0;
    while (x < books.length ) {
        if (books[x].name == null) {
            System.out.println("Empty");
        }
        else{
            System.out.println(books[x].name);
        }
        System.out.println();
        x = x+1;
    }
    
}
}
