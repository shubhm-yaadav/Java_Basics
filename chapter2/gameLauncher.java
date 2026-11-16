import java.util.Scanner;

public class gameLauncher {
    public static void main(String[] args) {
       
        
        gusseGame game = new gusseGame();
        game.startGame(); 
    }
}

class gusseGame  {
   
    public void startGame(){
        int randomNum = (int) (Math.random() * 10);
         
         while (true){

        System.out.println("Thinking for a random number btw 0 to 9.......");
        System.out.println();
        System.out.println(" And the random number is-> " + randomNum);
        player number = new player();
        number.gusses();

        boolean p1 = (randomNum == number.player1);
        boolean p2 = (randomNum == number.player2);
        boolean p3 = (randomNum == number.player3);

        if (p1){
            System.out.println("player1 won the game...");
            break;
        } if(p2){
            System.out.println("player2 won the game...");
            break;
        }
         if(p3){
            System.out.println("player3 won the game...");
            break;
        }
        else{
            System.out.println("know any player win");
        }
        System.out.println(" And the random number is-> " + randomNum);
        
         }

        
        
    }

}

class player{
    int player1;
    int player2;
    int player3;
    public void gusses(){
        
        System.out.println("Now it's your turn to guess the number------");
        System.out.println("player1 now you enter your number...");
        Scanner sc = new Scanner(System.in);
         player1 = sc.nextInt(); 
        System.out.println("Thanks for your number.....");
        System.out.println("player2 now you enter your number...");
         player2 = sc.nextInt(); 
        System.out.println("Thanks for your number.....");
        System.out.println("player3 now you enter your number...");
         player3 = sc.nextInt(); 
        System.out.println("Thanks for your number.....");
        
        
    }
}