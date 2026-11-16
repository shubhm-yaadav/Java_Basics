public class usinsgReferencesDog {
    String name ;
    public static void main (String[] args){
        usinsgReferencesDog dog = new usinsgReferencesDog();
        dog.name = "brat";

        usinsgReferencesDog[] myDogs = new usinsgReferencesDog[3];
        myDogs[0] = new usinsgReferencesDog(); 
        myDogs[1] = new usinsgReferencesDog();
        myDogs[2] = dog;    
        
        myDogs[0].name = "fred";
        myDogs[1].name = "marge";

        System.out.println("last dog name is ");
        System.out.println(myDogs[2].name);

        int x = 0;
        while (x < myDogs.length) {
            myDogs[x].bark();
            x = x+1;
        }
    }
    public void bark(){
        System.out.println(name + " say ruff!!!"); 
    }
    public void eat(){
        
    }
    public void chasecat(){
        
    }
}
