
package numbergame;



        import java.util.Scanner;

public class GuessingGame {

  public static void main(String[] args) {
      try (Scanner scanner = new Scanner(System.in)) {
          int min = 1;
          int max = 100;
          int attempts = 5; // Modify this for desired number of attempts
          
          boolean playAgain = true;
          
          while (playAgain) {
              
              int randomNumber = (int) (Math.random() * (max - min + 1)) + min;
              
          
              int guessCount = 0;
              boolean guessedCorrect = false;
              while (guessCount < attempts && !guessedCorrect) {
                  System.out.printf("Guess a number between %d and %d (%d attempts left): ", min, max, attempts - guessCount);
                  int guess = scanner.nextInt();
                  
                  if (guess == randomNumber) {
                      guessedCorrect = true;
                      System.out.println("Congratulations! You guessed the number in " + (guessCount + 1) + " attempts.");
                  } else if (guess > randomNumber) {
                      System.out.println("Too high! Try again.");
                  } else {
                      System.out.println("Too low! Try again.");
                  }
                  guessCount++;
              }
              
             
              if (!guessedCorrect) {
                  System.out.println("You ran out of attempts. The number was: " + randomNumber);
              }
              
            
              System.out.print("Play again? (y/n): ");
              char choice = scanner.next().charAt(0);
              playAgain = choice == 'y' || choice == 'Y';
          } }
  }
}

    
    

