// Programmers:  Brendan and Hans
// Course:  CS 212
// Due Date: 2/4/24
// Lab Assignment: 2
// Problem Statement: Make a simulation for 10 tickets of powerball and output the user's name during the steps.
// Data In: User's name
// Data Out: Numbers for lottery tickets, user's name, potential prize
// Credits: [Is your code based on an example in the book, in class, or something else?
//            Reminder: you should never take code from the Internet or another person

import java.text.DecimalFormat;
import java.util.Scanner;

class Lab2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Intro
        System.out.println("CS 212 - Lab 2");
        System.out.println("This program generates 10 lottery tickets.");

        // Get user name
        System.out.print("What's your name? ");
        String customerName = input.nextLine();
        // Format name to print only first name; need two separate statements to replace if the name leads with a space, but only one if it doesn't
        customerName = (customerName.charAt(0) == ' ') ? customerName.replaceFirst("\\s+", "").replaceFirst("\\s.+", "") : customerName.replaceFirst("\\s.+", "");

        // Get user's bet
        System.out.print("How much do you want to play? ");
        double bet = input.nextDouble();
        System.out.println("Great! " + customerName + " wants to play $" + String.format("%.2f", bet));

        // Generate lottery numbers
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 6; j++) {
                int number = (int) (Math.random() * (99 + 1));
                if (number == 3 || number == 5 || number == 16 || number == 58 || number == 59 || number == 11) {
                    bet = Math.pow(bet, 1.75);
                }
                System.out.print(String.format("%02d", number) + " ");
            }
            System.out.print("\n");
        }

        // Output name and potential jackpot
        System.out.println("-".repeat(18));

        // Print out good luck message and winnings
        System.out.println("Good luck " + customerName + "!");
        System.out.println("-".repeat(18));
        System.out.println("Your winnings: ");

        // Format long
        DecimalFormat formatter = new DecimalFormat("#,###.00");
        System.out.println("$" + formatter.format(bet));
        System.out.println("-".repeat(18));
    }
}
