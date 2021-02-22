/*Mini Project 1
Group# 3: Jay Patel, Griffin Starr,
          Alyssa Adams, Evan Starling
Date: 2/17/21
*/
import java.util.Scanner;
import java.util.Random;

class Main {
  public static void main(String[] args) {
   Scanner s = new Scanner(System.in);
    Random r = new Random();
    System.out.println("Welcome to the guessing game!");
    System.out.println("Please enter any positive whole number: ");
    int userNum = s.nextInt();
    int userRand = r.nextInt(userNum);
    System.out.println("A random number to guess has been generated");

    playGame(userNum, userRand);
  }

    public static void playGame(int funcuserNum, int funcuserRand){
      int game = 0;
      int numTries = 1;
      System.out.println("Please guess a number between 0 and " + funcuserNum);
      
       while(game != 1){
         Scanner s = new Scanner(System.in);

        int userGuess = s.nextInt();
        if (userGuess < funcuserRand){
          System.out.println("Too Low. Try Again: ");
          numTries++;
          System.out.println("Enter new guess: ");
        }else if (userGuess > funcuserRand){
          System.out.println("Too high. Try Again: ");
          numTries++;
          System.out.println("Enter new guess: ");
        }else if (userGuess == funcuserRand){
          System.out.println("Great, you win! It took you " + numTries + " tries");
          game = 1;
        }
      }
    }
}