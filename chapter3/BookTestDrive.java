class Book{
    String title;
    String author;
}

public class BookTestDrive {
    public static void main(String[] args){

        Book[] mybooks = new Book[3];
        
        mybooks[0] = new Book();
        mybooks[1] = new Book();
        mybooks[2] = new Book();

        mybooks[0].title = "The Grapes of Java";
        mybooks[1].title = "The java getby";
        mybooks[2].title = "The java cookbook";
        mybooks[0].author = "bob";
        mybooks[1].author = "sue";
        mybooks[2].author = "ieu";
        
        int x = 0;
        while (x < 3){
             System.out.print(mybooks[x].title);
             System.out.print(" by ");
             System.out.println(mybooks[x].author);
      x = x + 1;
        }
    }
}
