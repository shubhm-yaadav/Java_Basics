// Test class code to test the method.................
// public class simpleStartupTestDrive {
//     public static void main(String []args){
//         simpleStartup dot = new simpleStartup();

//         int [] locations = {2,3,4};
//         dot.SetLocationCells(locations);
//         int userguess = 4;
    
//         String result = dot.checkYoureself(userguess);

//         String testResult = "failed";
//         if(result.equals("hit")){
//             testResult = "Passed";
//         }
//         System.out.println(testResult);
//     }
// }


import java.util.Scanner;

public class simpleStartupGame {
    public static void main(String [] args){ 
        
        int numOfGuesses = 0;
        
        gameHelper helper = new gameHelper();
        
        simpleStartup theStartup = new simpleStartup();
        
        //To generate the ramdom number...................
        int randomNum = (int) (Math.random() * 5);
        int [] location = {randomNum, randomNum+1, randomNum+2 };
        
        // To print the random numbers..................
        for(int nummm : location){
            System.out.println(nummm);
        }
        
        theStartup.SetLocationCells(location);

        boolean isAlive = true;
        while (isAlive) {
            int guess = helper.getUserInput("Enter the number ");

            String result = theStartup.checkYoureself(guess);
            numOfGuesses++;

            if(result.equals("kill")){
                isAlive = false ;
                
                System.out.println("you took " +numOfGuesses +" gusses");
            }
            
        }
    }
}

//bug class which give the result when we enter the same number...................

 class simpleStartup{
    private int [] locationCells;
    private int numOfHits = 0;

    public void SetLocationCells(int [] locs){
        locationCells = locs ; 
    }

    public String checkYoureself(int guess){
        String result = "miss";
        for (int cell : locationCells){
            if(guess == cell){
                result = "hit";
               
                numOfHits ++;
                break;
            }
        }
            if (numOfHits == locationCells.length){
                result = "kill";
            }
            System.out.println(result);
            return result;
        } 
}

 class gameHelper{
    public int getUserInput(String prompt){
        System.out.print(prompt +" : ");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        return value ;
    }
}

