import java.io.FileNotFoundException;

public class write {
    
    public static void main(String[] args) {
        try {
   readTheFile("myFile.txt");
} 
catch (FileNotFoundException ex) {
  System.out.print("File not found.");
}
    }
    
}
