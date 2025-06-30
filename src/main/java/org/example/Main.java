package org.example;
import java.util.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int guessCount = 1;
        int guessUser = 0;
        int secretNumber = (int) (Math.random() * 5) + 1;

        System.out.println("I'm thinking of a number between 1 and 5.");

         while(guessCount<4){
             System.out.printf("Guess %d: ", guessCount);
             guessUser = input.nextInt();
             if (guessUser == secretNumber) {
                 System.out.println("You guessed it!");
                 System.out.println("You win!");
                 break;
             } else if (guessCount == 3)  {
                 System.out.println("You lose." + " The correct number was " + secretNumber);
                 break;
             } else {
                 System.out.println("Wrong guess.");
             }

             guessCount++;

         }



    }
}


