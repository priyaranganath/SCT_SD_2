import java.util.Random;
import java.util.Scanner;
public class RandomNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();
        int numberToGuess= rand.nextInt(1,101);
        int userGuess=0;
        int attempt=0;
        System.out.println("Guess the number (between 1 to 100)");
        while(userGuess!=numberToGuess){
            System.out.print("Enter your guess : ");
            userGuess= sc.nextInt();
            attempt++;
            if(attempt >= 10){
                System.out.println("Sorry, you've reached the maximum attempts! The number was: " + numberToGuess);
                break;
            }
            if(userGuess==numberToGuess){
                System.out.println("Congratulations! The number is " + numberToGuess + ", you guessed it right in " + attempt + " attempts !");
                System.out.println("Thanks for playing :)");
                break;
            } else if (userGuess>numberToGuess) {
                System.out.println("Ohh! Your guess is too high !Try a smaller number ! ");
            }else{
                System.out.println("Ohh! Your guess is too low !Try a higher number ! ");
            }
            System.out.println((10-attempt) + " more attempts left");
        }

    }
}
