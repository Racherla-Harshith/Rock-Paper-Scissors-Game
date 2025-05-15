import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Game game = new Game();
        String userChoice;

        System.out.println("🎮 Welcome to Rock-Paper-Scissors!");

        while (true) {
            System.out.print("Enter rock, paper, or scissors (or type 'exit' to quit): ");
            userChoice = scanner.nextLine().toLowerCase();

            if (userChoice.equals("exit")) {
                System.out.println("Thanks for playing!");
                break;
            }

            if (!game.isValidChoice(userChoice)) {
                System.out.println("Invalid input. Please try again.");
                continue;
            }

            String computerChoice = game.getComputerChoice();
            System.out.println("Computer chose: " + computerChoice);

            String result = game.determineWinner(userChoice, computerChoice);
            System.out.println(result);
        }

        scanner.close();
    }
}
