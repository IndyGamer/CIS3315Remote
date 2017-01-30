package elementary;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class guessNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int answer = rand.nextInt(99)+1;
        System.out.println("Joshua's Guessing Game");
        System.out.println("Guess a number between 1 and 100");
        while (true) {
            System.out.println("Enter a number:");
            int guess = sc.nextInt();
            if (guess == answer) {
                break;
            } else if (guess >= answer) {
                System.out.println("The nummber is lower. Try again.");
            } else {
                System.out.println("The number is higher. Try again.");
            }
        }
        System.out.println("You Win!!! YAY!");
    }
}
