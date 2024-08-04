import java.util.Scanner;
import java.util.Random;
/**
 * NumberGame
 */
public class NumberGame{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String play = "y";
        System.out.println("WELCOME TO THE NUMBER GAME!");
        System.out.println("You Have To Guess A Number Between 1 and 100.");
        // while loop for if user want to play again.
        while(play.equals("y"))
        {
            Random random = new Random();
            int Number = random.nextInt(100);
            int guesses = -1;
            int chances = 0;
        
        while(guesses!=Number)
        {
            // taking user guess 
            System.out.println("Guess a number: ");
            guesses = sc.nextInt();
            chances++;
            // condition to check is user guess is correct?
            if(guesses==Number){
                System.out.println("Congratulations! Your Guess Is Correct.");
                System.out.println("You took " +chances+ " chances to win.");
                System.out.println("Do you want to play again? y/n: ");
                play = sc.next().toLowerCase();
            }
            else if(guesses>Number){
                System.out.println("too high,try once again.");
            }
            else{
                System.out.println("too low,try once again.");
            }
            }
        }
    sc.close();
    }
}

