import java.util.Random;

public class Game {
    private final String[] choices = {"rock", "paper", "scissors"};
    private final Random random = new Random();

    public String getComputerChoice() {
        int index = random.nextInt(3);
        return choices[index];
    }

    public String determineWinner(String userChoice, String computerChoice) {
        if (userChoice.equals(computerChoice)) {
            return "It's a tie!";
        }

        switch (userChoice) {
            case "rock":
                return computerChoice.equals("scissors") ? "You win!" : "You lose!";
            case "paper":
                return computerChoice.equals("rock") ? "You win!" : "You lose!";
            case "scissors":
                return computerChoice.equals("paper") ? "You win!" : "You lose!";
            default:
                return "Invalid user input.";
        }
    }

    public boolean isValidChoice(String choice) {
        for (String c : choices) {
            if (c.equalsIgnoreCase(choice)) {
                return true;
            }
        }
        return false;
    }
}
