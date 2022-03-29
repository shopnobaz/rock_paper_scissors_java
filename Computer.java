package Game;
import java.util.Random;
import java.util.Scanner;

/**
 * This is the Class that handles all the computer choices for the game.
 * To generate automatically random numbers for computer choice option, we use method here
 * @ jahed
 */


public class Computer {

    private String computerChoice;
    private Random random;    // we use this built in random option to generate random numbers.

    /**
     * This is the constructor for the Computer Class
     */

    public Computer(){
    this.random= new Random();
    }

    /**
     * We are using built-in random option in a method to generate random numbers to use as computer choice
     */
    public void askComputerChoice() {
        int number = random.nextInt(3)+1;
        String computerMove= "";
            if (number == 1) {
                computerMove = "rock" ;
            } else if (number == 2) {
                computerMove = "paper";
            } else if  (number == 3) {
                computerMove = "scissors";
            }
            System.out.println("Computer Choose : " + computerMove);
            this.computerChoice= computerMove;
        }

    /**
     * we are returning a value  through this method which we got from above function
     * @return
     */

    public String getComputerChoice(){
        return computerChoice;
    }

}