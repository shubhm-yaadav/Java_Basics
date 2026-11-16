public class codemagnet20 { 
    public static void main (String [] args){
        
        int x = 3;

        while (x > 0) {
            // System.out.print(x);
            if (x > 2){
                System.out.print("a");
            }
             
            x = x - 1 ;
            System.out.print("-"); 

            if (x == 2){
                System.out.print("b c");
            }

            if (x == 1) {
                System.out.print("d");
                x = x - 1;
                // System.out.println(x);
            }
        }
    }
}
