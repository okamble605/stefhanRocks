import java.util.Random;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // Generate a random number to be guessed
    Random random = new Random();
    int number = random.nextInt(100) + 1;

    Scanner scanner = new Scanner(System.in);
    int guess = 0;
    while (guess != number) {
      System.out.println("Enter your guess (1-100):");
      guess = scanner.nextInt();

      if (guess < number) {
        System.out.println("Your guess is too low.");
      } else if (guess > number) {
        System.out.println("Your guess is too high.");
      } else {
        System.out.println("You guessed the number!");
      }
    }

    scanner.close();
  }
}
