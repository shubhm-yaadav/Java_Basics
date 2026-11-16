public class looping {
    public static void main( String [] args){
        int x = 1;

        System.out.println("Before the loop..........");
        System.out.println(x);

        while (x < 4) {
            System.out.println("In the loop......");
            x = x + 1;
            System.out.println("Value of x is-- " +x);
        }
        System.out.println("Loop statement end.....");
    }
}
