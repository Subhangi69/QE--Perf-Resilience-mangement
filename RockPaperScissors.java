import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Welcome to game!");
        boolean playAgain = true;
        while (playAgain) {
            System.out.println("\nEnter your choice (rock, paper, scissors): ");
            String userChoice = scanner.nextLine().toLowerCase();
            int compInt = random.nextInt(3); // 0,1,2
            String compChoice = "";
            switch (compInt) {
                case 0 -> compChoice = "rock";
                case 1 -> compChoice = "paper";
                case 2 -> compChoice = "scissors";
            }
            System.out.println("Computer chose: " + compChoice);
            if (userChoice.equals(compChoice)) {
                System.out.println("It's a tie!");
            } else if (
                    (userChoice.equals("rock") && compChoice.equals("scissors")) ||
                    (userChoice.equals("paper") && compChoice.equals("rock")) ||
                    (userChoice.equals("scissors") && compChoice.equals("paper"))
            ) {
                System.out.println("You win!");
            } else if (
                    userChoice.equals("rock") || userChoice.equals("paper") || userChoice.equals("scissors")
            ) {
                System.out.println("Computer wins!");
            } else {
                System.out.println("Invalid input. Please enter rock, paper, or scissors.");
            }
            System.out.println("\nwant to play again? (y/n): ");
            String answer = scanner.nextLine().toLowerCase();
            if (!answer.equals("y")) {
                playAgain = false;
                System.out.println("Good");
            }
        }
        scanner.close();
    }
}
