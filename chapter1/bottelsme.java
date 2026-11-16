public class bottelsme {
    public static void main(String [] args){

        int bottelsNO = 10;
        String word = "bottels";
        while (bottelsNO > 0) {

            if(bottelsNO < 2){
                word = " bottel";
            }

            System.out.println(bottelsNO + " green " + word + " hanging on the wall");
            System.out.println("One bottel fall");
            bottelsNO -= 1;

        }
        System.out.println("There is no bottel hanging on the wall");
    }
    
}
