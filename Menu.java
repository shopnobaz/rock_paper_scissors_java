package Game;

import java.util.Scanner;

/**
 * This  Class is responsible for all the menu options that player chose from.
 *  To generate automatically random numbers for computer choice option, we use method here
 *  @ jahed
 */

public class Menu {

    Scanner input;

    public Menu() {
        input = new Scanner(System.in); // Making a new object out of Scanner method.
    }

    /**
     * showing the Main Menu to chose the options from
     */
    public int printMainMenu() {
        System.out.println("1. New Match  2. History  3. Exit");
        int choice = input.nextInt();
        return choice;

    }

    /**
     * The menu to chose from to start a new game
     */
    public void printPlayerChocieMenu() {
        System.out.println("1. rock  2. paper  3. scissors");

    }

    /**
     * This menu represents the several options to continue or quit the game for the player
     */


    public int printAfterMatchMenu() {
        System.out.println("\n1.Main_menu  2.Run_again  3.Exit");
        int menuChoiceNumber = input.nextInt();
        if (menuChoiceNumber == 1) {
            //  printMainMenu();
        } else if (menuChoiceNumber == 2) {
            // printPlayerChocieMenu();
            // System.out.println("1. rock  2. paper  3. scissors");

        } else if (menuChoiceNumber == 3) {
            System.exit(0);
        }
        return menuChoiceNumber;
    }
}
