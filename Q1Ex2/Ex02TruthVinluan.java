package LabEx2;

import java.util.Scanner;

public class Ex02TruthVinluan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // default settings
        int guessesSetting = 3;
        int maxValue = 10; 
        int minValue = 1;
        
        boolean isEnded = false;
        do {
            System.out.println("Hello! Welcome to \"Higher or Lower.\"\n-Start game\n-Change settings\n-Stop");
            String setting = sc.nextLine();
            
            switch (setting) {
                case "Start game":
                    String willPlayAgain = "y";
                    while (willPlayAgain.equals("y")) {
                        int random = (int) Math.floor(Math.random() * maxValue) + minValue;
                        int guessesRemaining = guessesSetting;
                        for (int i = 0; i < guessesSetting; i += 1) {
                            System.out.printf("You have %d guess(es) remaining. Your guess? ", guessesRemaining);
                            int guess = Integer.parseInt(sc.nextLine());
                            if (guess == random) {
                                System.out.println("You got it right!\nWill you play again?");
                                willPlayAgain = sc.nextLine();
                                if (willPlayAgain.equals("n")) break;
                            } else {
                                guessesRemaining -= 1;
                                if (guessesRemaining == 0) {
                                    System.out.printf("\nYou lost! The number was %d.\nWill you try again? (y/n) ", random);
                                    willPlayAgain = sc.nextLine();
                                    if (willPlayAgain.equals("n")) break;
                                } else {
                                    boolean guessIsGreater = guess > random;
                                    if (guessIsGreater) {
                                        System.out.println("Guess lower!");
                                    } else {
                                        System.out.println("Guess higher!");
                                    }
                                }
                            }
                        }
                    }
                    break;
                case "Change settings":
                    System.out.println("What is the greatest possible random number?");
                    maxValue = Integer.parseInt(sc.nextLine());
                    System.out.println("What is the lowest possible random number?");
                    minValue = Integer.parseInt(sc.nextLine());
                    while (!(minValue > maxValue)) {
                        System.out.println("The minimum value is greater than or equal to the maximum value. What is the lowest possible random number?");
                        minValue = Integer.parseInt(sc.nextLine());
                    }
                    System.out.println("How many guesses will be allowed?");
                    guessesSetting = Integer.parseInt(sc.nextLine());
                    System.out.printf("Lower bound: %d\nUpper bound: %d\nGuesses: %d\n", minValue, maxValue, guessesSetting);
                    break;
                case "Stop":
                    System.out.println("Alright, come again!");
                    isEnded = true;
                    break;
            }
        } while (!isEnded);
    }
}