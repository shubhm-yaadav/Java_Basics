import java.util.Arrays;

class Dog{
    String name ;

     void bark(){
        System.out.println("Dog is barking....");
     }

     void eat(){
        System.out.println("Dog is eating....");
     }

     void chaceCat(){
        System.out.println("Chassing the cat....");
     }

}

public class arrayReferenceUse {
    public static void main (String [] args){
        
        Dog[] myDogs = new Dog[3];

        myDogs[0] = new Dog();
        myDogs[0].name = " fido";
        System.out.print(myDogs[0].name +" ");
        myDogs[0].bark();

        myDogs[1] = new Dog();
        myDogs[1].name = "dido";
        System.out.println(myDogs[1].name);
        myDogs[1].bark();

        System.out.println(Arrays.toString(myDogs));
        

    }
    
}
