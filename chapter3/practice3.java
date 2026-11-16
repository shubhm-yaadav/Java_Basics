// 5. Bank Account System

// Create BankAccount class:

// accountHolder
// balance

// Store multiple accounts in array.

// Tasks:

// print total bank balance
// find richest customer
// count accounts with balance less than 1000

class BankAccount{
    String accountHolder;
    int balance;

}
public class practice3 {
    public static void main(String[] args){
        BankAccount[] details = new BankAccount[5];

        details[0] = new BankAccount();
        details[1] = new BankAccount();
        details[2] = new BankAccount();
        details[3] = new BankAccount();
        details[4] = new BankAccount();

        details[0].accountHolder = "Shubham";
        details[0].balance = 569;
        details[1].accountHolder = "Rohan";
        details[1].balance = 64948;
        details[2].accountHolder = "Rahul";
        details[2].balance = 239556234;
        details[3].accountHolder = "Rohit";
        details[3].balance = 3564;
        details[4].accountHolder = "Raman";
        details[4].balance = 564694;

        //adding the total bank amount.....
        int x = 0;
        int count = 0;
        int totalbalance = 0;
        int richest = details[0].balance;
        String accholderName = details[0].accountHolder;
        while (x < details.length) {
            totalbalance = details[x].balance + totalbalance ;

            if(details[x].balance < 1000){
                count++;
                System.out.println(details[x].accountHolder +" account is less than 1000 ----> "+ count);
            }

            if(details[x].balance > richest){
                richest = details[x].balance; 
                accholderName = details[x].accountHolder; 
                
            }
            
            x = x+1;
            
        }    
    System.out.println("The total amount in this bank is -----> " +totalbalance);
    System.out.println( accholderName +" is the richest custemer in this bank is ----> "+ richest);

}
    }
