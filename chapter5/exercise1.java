public class exercise1 {
    public static void main(String[] args){
        
        Output out = new Output();
        out.go();

    }
}

    class Output{
        void go (){
            int value = 7;
            for(int i = 1; i < 8; i++){
                value++;
                // System.out.println(value);
                if(i > 4){

                    System.out.print(i+" ");
                    System.out.println(++value +" ");
                    
                }
                System.out.println("current value is " +value);
                if (value > 14){
                    System.out.println(" i = " +i);
                    break;
                }
            }
        }
    }
    

