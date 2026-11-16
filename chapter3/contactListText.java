 class contactList {
    String name;
    String description;
    long phoneNumber;
    
    void save(){
        System.out.println("your number is saved....");
    }
}

public class contactListText{
    public static void main (String[] args){
        contactList[] contact = new contactList[10];
         contact[0] = new contactList();
         
         contact[0].name ="Rohit";
         contact[0].phoneNumber = 8253558968L;
         contact[0].description = "Remember this is a file where we can write details about the contact what is necessary detail about the contact";
         contact[0].save();
         System.out.println();
         contact[1] = new contactList();
         contact[1].name = " shubham kumar";
         contact[1].phoneNumber = 5364546356l;
         contact[1].save();
         System.out.println();
         System.out.println(contact[0].name +" " +contact[0].phoneNumber);
    }
}
