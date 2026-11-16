
public class FirstObject {
    public static void main(String[] args) {
        
        Dog d = new Dog();

        d.bark();
        System.out.println(d.size);
        d.bread = "huskey";
        System.out.println(d.bread);


    }
}

class Dog {

    int size = 50;
    String bread;
    String name;

    void bark(){
        System.out.println("Bhaw Bhaw");
    } 

}
