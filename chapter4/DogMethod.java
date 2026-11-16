class dog { 
    String name;

    void bark (int numOfBark){
        while (numOfBark > 0) {
            System.out.println("ruff! ruff!");
            numOfBark = numOfBark - 1;   
        }
    }
}

public class DogMethod{
    public static void main (String[] args){
         dog d = new dog();
         d.bark(5);
         
    }
    
}
