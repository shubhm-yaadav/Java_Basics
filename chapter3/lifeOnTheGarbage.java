class Book {
    String name;
    String WriterName;

    void read(){
        System.out.println("Started reading the book..........");
    }
}

public class lifeOnTheGarbage {
    public static void main(String [] args){
        
        Book b = new Book();

        Book c = new Book();

        Book d = c;
        
        d.name = "java";

        b = c ;

        c =  null;

        // System.out.println(c.name);

        b.read();

    }
}
