import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int RandomNumber = (int)(Math.random() * 100) + 1;
        Scanner sc = new Scanner(System.in);
        int guess = 0;
        int attempts = 0;

        System.out.println("--------Welcome to Guess the Right Number Game--------");
        System.out.println("Please enter a random number between 1 and 100:");

        try {
        while (guess != RandomNumber) {
            guess = sc.nextInt();
            attempts++;
            list.add(guess);

            if (guess < RandomNumber) {
                System.out.println("\nYour number " + guess + " is Too Low");
            } else if (guess > RandomNumber) {
                System.out.println("\nYour number " + guess + " is too high");
            } else {
                System.out.println("You guessed the number " + guess + " right in " + attempts + " attempts!");
                System.out.println("Your previous attemps are : ");
                for(Integer l : list){
                    System.out.print(l+ " ");
                }
                
            }

            if (guess != RandomNumber) {
                System.out.println("Try again:");
            }
        }
    }
    catch(InputMismatchException e){
        System.out.println("please enter a valide number");
    }
    catch(Exception e){
        System.out.println("something went wrong");
    }

        sc.close();
    }
}
