class poorDog {

    private int Size;
    private String Name;

    public int getSize(){
        return Size;
    }

    public String getName(){
        return Name;
    }
}

public class poorDogTestDrive {
    public static void main(String[] args) {
        
        poorDog poor = new poorDog();
        System.out.println("The name of poor dog is--> "+poor.getName());
        System.out.println("The size of poor dog is--> "+poor.getSize());
    }
}
