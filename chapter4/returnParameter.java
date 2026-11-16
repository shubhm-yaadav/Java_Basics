class adding{
    int add(int x , int y){
        return x + y;
    }
}

public class returnParameter {
     public static void main(String[] args) {
         adding ad = new adding();
         int finalss = ad.add(2,3);
         System.out.println("the number is : " + finalss);
        
    }
}
