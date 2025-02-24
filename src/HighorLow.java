import java.util.Scanner;
import java.util.Random;
public class HighorLow {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = random.nextInt(10) + 1;
        int userGuess;


        do {
            System.out.print("Guess a number between 1 and 10: ");
            while (!in.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer between 1 and 10.");
                in.next();
            }
            userGuess = in.nextInt();
        } while (userGuess < 1 || userGuess > 10);

        System.out.println("The random number was: " + randomNumber);

        if (userGuess < randomNumber) {
            System.out.println("Your guess was too low!");
        } else if (userGuess > randomNumber) {
            System.out.println("Your guess was too high!");
        } else {
            System.out.println("On the money! You guessed correctly.");
        }

        in.close();
    }
}