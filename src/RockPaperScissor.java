import java.util.Random;

//backend
public class RockPaperScissor {
    // all of the choices that a computer can choose
    private static final String[] computerChoices = {"Rock", "Paper", "Scissors"};


    // store the computer choice tso that we can retrieve the value and display it to the frontend
    private String computerChoice;

    // store the scores so that we can retrieve the values and display it to the frontend.
    private int computerScore, playerScore;

    //use to generate a random number ot randomly choose an option for the computer
    private Random random;

    public String getComputerChoice() {
        return computerChoice;
    }

    public int getPlayerScore() {
        return playerScore;
    }

    public int getComputerScore() {
        return computerScore;
    }

    // constructor - to initialize random obj
    public RockPaperScissor(){
        random = new Random();
    }

    // call this method to begin playing rock paper scissors
    // playerChoice - is the choice made by the player.
    // this method will return the result of the game
    public String playRockPaperScissor(String playerChoice){
        // generate computer choices
        computerChoice = computerChoices[random.nextInt(computerChoices.length)];

        // will contain the returning message indicating the result of the game
        String result;

        //evaluate the winner
        if(computerChoice.equals("Rock")){
            if(playerChoice.equals("Paper")){
                result = "Player Win";
                playerScore++;
            } else if (playerChoice.equals("Scissors")) {
                result = "Computer Wins";
                computerScore++;
            }else{
                result = "Draw";
            }
        } else if(computerChoice.equals("Paper")){
            if(playerChoice.equals("Scissors")){
                result = "Player Win";
                playerScore++;
            } else if (playerChoice.equals("Rock")) {
                result = "Computer Wins";
                computerScore++;
            }else{
                result = "Draw";
            }
        } else {
                if(playerChoice.equals("Rock")){
                    result = "Player Win";
                    playerScore++;
                } else if (playerChoice.equals("Paper")) {
                    result = "Computer Wins";
                    computerScore++;
                }else{
                    result = "Draw";
                }
            }

            return result;
    }


}
