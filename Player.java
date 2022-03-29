package Game;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * As the name suggest- almost all the player related function and calculations happen here
 * We have some Arrays to save game history and call back when necessary.
 * @ jahed
 */
public class Player {
    ArrayList<String> matchHistoryList; // This array stores the history/histories of the game
    private String playerChoice; //

    public Player(){
        matchHistoryList = new ArrayList<>(); // Initializing the array here.
    }

    Scanner input = new Scanner(System.in);

    /**
     * Saving the input of the player and shows the concerning game-option according to the input number
     */
    public void askPlayerChoice() {
        String playerMove= " ";
        int playerWish = input.nextInt();

        if (playerWish == 1) {
            playerMove = "rock";
        } else if (playerWish == 2) {
            playerMove = "paper";
        } else if (playerWish == 3) {
            playerMove = "scissors";
        }
        this.playerChoice = playerMove;

    }

    public String getPlayerChoice(){   //Retuning the value that we got from the above function
        return playerChoice;
    }

    /**
     * Adding the match result to the Array
     * @param result
     */
    public void addMatchToHistory(String result) {
        matchHistoryList.add(result);
    }

    public void printHistory() {
        // Loop once time for every result stored in history
        for( String matchResult : matchHistoryList) {
            System.out.println(matchResult);
        }
    }
}
































