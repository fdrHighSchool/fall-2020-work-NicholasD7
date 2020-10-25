import java.util.Random;   //imports the Random pakage
import java.util.Scanner;  //imports the Scanner package
class Main {
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    //takes in the variable in as a new scanner
    Random rand = new Random();
    // takes in the variable rand as a new random
    int randint;
    int User_diff;
    int range;              //set variables used in the code
    int User_num = 0;
    int guesses = 0;
    String playAgain = "y";

    while (playAgain.equals("y")) {
      //chooses the difficulty and assigns a random nuber to be guessed
      System.out.print("what is the difficulty 1-10: ");
      User_diff = in.nextInt();
      range = User_diff * 10;
      randint = rand.nextInt(range);

      System.out.println("I am thinking of a number between 1 and " + range + ".");

      while (User_num != randint) {                                         //repeats until the user guesses correctly
        System.out.println("Can you guess what it is?  \ntype a number: "); //asks for an input
        User_num = in.nextInt();                                            //assigns the user input to User_num
        System.out.println("your number is: " + User_num);                  //responds back to the user

        if (User_num > randint) {
          //if the user guess is higher, they must go lower
          System.out.println("Go lower");
          guesses++;   //adds a guess
        } else if (User_num < randint) {
          //if the user guess is lower, they must go higher
          System.out.println("Go higher");
          guesses++;   //adds a guess
        } else {
          //if the user guesses the number the loop stops
          System.out.println("YOU HAVE GUESSED THE NUMBER! GOOD JOB!");
        }
      }
      System.out.println("you have guessed the number in: " + guesses + " attempts.\nDo you want to play again?(y/n)");
      playAgain = in.next();
    }
  }
}
