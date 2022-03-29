package Game;

import java.util.Scanner;

/**
 * This RunGame Class wokrs as Main Class in the game.
 * It decides which function will run in which order.
 * This class gather all the necessary functions/methods to run the game.
 * @ jahed
 */
public class RunGame {
    public static void main(String[] args) { //This method is to run the whole program

        Player player = new Player(); // creating an object of Player class
        Computer computer = new Computer(); // creating an object of Compputer class
        MatchLogic matchLogic = new MatchLogic(); // creating an object of MatchLogic class
        Menu menu = new Menu(); // creating an object of Menu class

        boolean gameActive = true;
        while (gameActive) { // starting  the main loop here
           // menu.printMainMenu(); //calling the method to print the main menu to print
            int menuChoice = menu.printMainMenu();//menu.getMainMenuChoice();
            switch (menuChoice) {
                case 1: // 1. New Match

                    boolean afterMatchChoiceActive= true;
                    while( afterMatchChoiceActive) {
                        menu.printPlayerChocieMenu();

                        player.askPlayerChoice();
                        System.out.println("\nPlayer chose  : " + player.getPlayerChoice()); // showing the chosen player option

                        System.out.println("\n");
                        computer.askComputerChoice(); // calling the method to show computer choice

                        matchLogic.decidePlayerMatchResult(player, computer);//calling the method to calculate the logic to declare winner
                        System.out.println(matchLogic.result);
                        System.out.println("\n");

                        int afterMatchChoice = menu.printAfterMatchMenu();
                        switch (afterMatchChoice) {
                            case 1: //1.Main_Menu AfterMatchMenu
                                afterMatchChoiceActive= false;
                                break;
                            case 2: //2.Run_again afterMatchMenu
                                break;
                            case 3: // 3. Exit afterMatchMenu
                                gameActive= false;
                                afterMatchChoiceActive= false;
                                System.out.println("Thank you for palying");
                                break;
                            default:
                                System.out.println("Crazy input, please use something else");

                        }

                        // We want to start a match and a loop with the menu.printAfterMatchMenu
                        // Until the user selects back to main menu/main loop, or Exit Game
                    }
                        break;

                case 2: // 2. Print history
                    System.out.println("The player chose to see history");
                    player.printHistory();
                    break;

                case 3: // 3. Exit Game
                    System.out.println("The player chose  to exit the game");
                    gameActive = false;
                    break;
                default:
                    System.out.println("Crazy input again, please use something else");
            }
            System.out.println("\n");
        }
    }
}












