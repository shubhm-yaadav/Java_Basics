public class phaseOMatricMe {
    public static void main(String[] args){
        
        String [] listone = {"my", "name", "is", "shubham", "kumar", "yadav"};

        String [] listtwo = {"my",  "rohit", "is", "kumar", "raj", "name"};

        String [] listthree = {"my", "name", "is", "gaurav", "kumar", "yadav"};

        // int listfirst = listone.length;
        int listsecond = listtwo.length;
        int listthird = listthree.length;

        System.out.println(listtwo);

        java.util.Random randomGenerator = new java.util.Random();

        int random1 = randomGenerator.nextInt(listone.length);
        int random2 = randomGenerator.nextInt(listsecond);
        int random3 = randomGenerator.nextInt(listthird);

        String sentence = listone[random1] +"  " +listtwo[random2]+"  " +listthree[random3];

        System.out.println( "we want to know " +sentence);
        System.out.println(((Object)random1).getClass().getSimpleName());

    }
    
}
