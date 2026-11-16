public class array {
    public static void main(String[] args) {
        
        int [] arr = new int[7];
        
         arr[0] = 6;
         arr[1] = 5;
         arr[2] = 55;
         arr[3] = 585;
         arr[4] = 85;
         arr[5] = 785;
         arr[6] = 7525;

        // System.out.println(arr);
        int i = 0;
        while (i < arr.length) {
            // System.out.println(i);
            System.out.print(arr[i] + ",");

            i = i+1;
        }
    }
    
}
