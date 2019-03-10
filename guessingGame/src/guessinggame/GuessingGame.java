
package guessinggame;

/**
 * Title: Number Guessing game Authorr: Jenna Connolly 
 * Description: Create a
 * number guessing game
 * 
 */
import java.util.Scanner;
//import java.util.concurrent.ThreadLocalRandom;

import java.util.Random; 

public class GuessingGame {

    private static final int MIN_NUMBER = 1;

    private static final int MAX_NUMBER = 110;

    private static final int EXIT_VALUE = -1;

    private static final int MAX_GAMES = 256;

    private static final int MAX_GUESSES = 10;

    private static final int HELP_THRESHOLD = 4;

    private static int numberOFGames = 0;

//private static int randomNumber = 0;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int userGuess;
        int numberTrys = 0;
        boolean playAgain = true;
        int correctGuess = 5;
        boolean playAgainResponse = true;
        int wrongGuess = 0;
        boolean playGame;
        int numberOfWins = 0;
        int numberOfLoss = 0;

        Scanner stdin = new Scanner(System.in);

        do {
            // game loop starts
            playGame = gameLoop();
            numberOFGames += 1;

            if (playGame == true) {
                numberOfWins += 1;
            } else {
                numberOfLoss += 1;
            }

            System.out.println("You have played " + numberOFGames
                    + " games.");

            //System.out.println(playGame);
            // checking user response for another game
            playAgainResponse = playAgainFunc(playAgain);
            System.out.println(playAgainResponse);

            // ending game check
            if (playAgainResponse == false || numberOFGames > MAX_GAMES) {
                endGame(numberOfWins, numberOfLoss);
                playAgain = false;
            } else {
                playAgain = true;
            }
            

        } while (playAgain);
    }

    // Made a greeting function
    public static void greeting() {
        System.out.println("*** You are playing the CSC110 Guessing Game ***!");
//        System.out.println("Please Choose a number");
    }

    // checks the user guess and compares to computer gues
    public static boolean gameLoop() {
        Scanner stdin = new Scanner(System.in);
        greeting(); // calling greeting

        int correctGuess = 5;
        int numGuesses = 0;
        int userGuess;
        boolean GameIsPlaying = true;
        boolean gameLoss = false;
        String wrongMessage;

        boolean userWon = false;
        // create rand var
        int randomNum = randomNumberGen();
        // make it point ot random function

        do {
            // 
            wrongMessage = " ";
            numGuesses += 1;
            userGuess = rangeCheck(); // checks if numberis in range
            if (userGuess == randomNum) {
                System.out.println("*** GOT IT *** it took you " + numGuesses
                        + " guesses");
                userWon = true;
                GameIsPlaying = false;
            } else if(userGuess == EXIT_VALUE) {
                
                userWon = false;
                GameIsPlaying = false;
              //  wrongMessage = "nope...";
                //System.out.println("nope...");
            }
             // iterating number guess
            gameLoss = numberOFGuessChecker(numGuesses, randomNum, userGuess); // checking  number of guess

            if (gameLoss) { // if gameLoss is true 
                GameIsPlaying = false;
                userWon = false;
            }

        } while (GameIsPlaying);

        return userWon;

    }

    // checking if number is in range
    public static int rangeCheck() {
        int userNum;
        Scanner stdin = new Scanner(System.in);

        do {
            System.out.println("Enter a number between 1 and 110 "
                    + " (-1 to give up):");
            userNum = stdin.nextInt();

            if (userNum == EXIT_VALUE) {
                System.out.println("*** QUITTER ***");
                return userNum;
            } else if (userNum > MAX_NUMBER) {
                System.out.println(userNum + " is too big...");
            }  else if(userNum < MIN_NUMBER){
                System.out.println(userNum + " is too small...");
                
            }

        } while (userNum < MIN_NUMBER || userNum > MAX_NUMBER);
        return userNum;

    }

    // checks number of guess
    public static boolean numberOFGuessChecker(int numGuesses,
        int randomNum, int userGuess) {
        
        String message = "nope...";
        boolean gameLoss = false;
        
        if (numGuesses >= HELP_THRESHOLD) {

            if (userGuess > randomNum) {
                message += "lower";
            } else if (userGuess < randomNum) {
                message += "higher";
            } 
//            else if (userGuess == randomNum){
//                message = "";
//            }

        }
        
        if (userGuess == randomNum){
                message = "";
        }

        if (numGuesses == MAX_GUESSES) {
            gameLoss = true;
        }

        System.out.println(message);
        return gameLoss;
    }

    // runs a loop to check to play agin
    public static boolean playAgainFunc(boolean playAgain) {
        Boolean loopTrue = true;
        String userResponse;
        Scanner stdin = new Scanner(System.in);
        System.out.println("Do you want to play again? [Y,N]");

        do {
            userResponse = stdin.nextLine().toLowerCase();
            if (userResponse.equals("y")) {
                playAgain = true;
                loopTrue = false;
            } else if (userResponse.equals("n")) {
                playAgain = false;
                loopTrue = false;
            } else {
                System.out.println("You did not choose [Y,N]");
                System.out.println("Please choose, [Y,N]");
            }

        } while (loopTrue);
        //System.out.println(playAgain + " playagin func");

        return playAgain;
    }

    public static int randomNumberGen() {
        Random rand = new Random();
        int numPicker = rand.nextInt(110) + 1;
        System.out.println(numPicker);
        return numPicker;
    }
    
    public static double calculate(int total, double userInput){
        int hundred = 100;
        return ((userInput/total) * hundred);
    }

    public static void endGame(int winGames, int lostGame) {

        int total = winGames + lostGame;
        double winPercent = calculate(total,winGames);
        double losePercent = calculate(total,lostGame);

        System.out.println("Thanks for playing the CSC110 guessing game.");
        System.out.println("You played "+ total +" games and won 2 of them."
                + " Your winning percentage is " + winPercent);
    }

    // resets values in a new game 
    public static int resetGame(int value) {
        if (value > 0) {
            value = 0;
        }
        return value;
    }

}
