package Game;

public class MatchLogic {
    public String result = " "; // An empty variable to store values

    /**
     * Matchlogic Class is one of the most important Class in the game.
     * It  shows us how to calculate and compare between the "Player and Computer" according to give logics.
     * @ jahed
     */
    public MatchLogic() {

    }

    /**
     * This the main function of the Class and one of the important function for the whole game.
     * As the name suggest- we get the decision about winner through this function/
     * @param player
     * @param computer
     */
    public void decidePlayerMatchResult(Player player, Computer computer) {
        // Make player select a new choice''
        String playerChoice = player.getPlayerChoice();
        // Make computer generate a random choice
        //computer.askComputerChoice();
        String computerChoice = computer.getComputerChoice();

        if ((playerChoice.equals("rock") && (computerChoice.equals("rock"))||
           (playerChoice.equals("scissors") && (computerChoice.equals("scissors"))||
           (playerChoice.equals("paper") && (computerChoice.equals("paper")))))){
            result= "\nMatch is a tie. No one won the round";
        }
        // condition for players Win
        else if (playerChoice.equals("rock") && (computerChoice.equals("scissors"))||
          (playerChoice.equals("scissors") && (computerChoice.equals("paper"))||
          (playerChoice.equals("paper") && (computerChoice.equals("rock")))))
        {
            result= "\nThe player  won the round";

        }
        // condition for player lost
        else {
            result= "\nThe player lost  the round";

        }

        player.addMatchToHistory(result);   // Here we add the result of the game/games to the history to save.
    }



}
