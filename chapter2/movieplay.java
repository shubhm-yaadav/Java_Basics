 class movie {
    String name;
    String releaseDate;
    int rateing;

    void playit (){
        System.out.println("Movie is playing now.......");
    }
    
}

public class movieplay{
    public static void main(String [] args){

        movie one = new movie();
        one.name = "Race";
        one.releaseDate = "10/8/24";
        one.rateing = 5;

        movie two = new movie();
        two.name = "Dhoom";
        two.releaseDate = "12/4/25";
        two.rateing = 9;

        movie three = new movie();
        three.name = "Krish";
        three.releaseDate = "4/6/25";
        three.rateing = 9;

        System.out.println(one.name);
        System.out.println(one.releaseDate);
        System.out.println(one.rateing);
        one.playit();
        

    }
}
