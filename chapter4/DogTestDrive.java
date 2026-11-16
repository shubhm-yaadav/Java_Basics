

class Dog {
    int size;
    String name;

    void bark(){
        if(size > 60){
            System.out.println("wooof! wooof!");
        }else if(size > 14){
            System.out.println("ruff! ruff!");
        }else{
            System.out.println("yip yip");
        }
    }
}
public class DogTestDrive {
    public static void main(String[] args){
        Dog first = new Dog();
        first.size = 40;
        first.name = "BoB.... the builder";
        
        Dog second = new Dog();
        second.name = " dugu...... my dog";
        second.size = 45;

        Dog three = new Dog();
        three.name = " indi.... indian breed dog's";
        three.size = 8;

        first.bark();
        System.out.println(first.name);
        second.bark();
        System.out.println(second.name);
        three.bark();
        System.out.println(three.name);
    }
}