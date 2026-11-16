import java.util.Arrays;

class Dog{

}

public class arrayReference {
    public static void main(String[] args){
        // Dog [] arr ;

        Dog [] arr = new Dog[7];

        arr[0] = new Dog();
        arr[1] = new Dog();

        arr [3] = arr[1];

        System.out.println(Arrays.toString(arr));
    }
}
