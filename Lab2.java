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
        long prize = 225938745L;
        Scanner input = new Scanner(System.in);

        System.out.println("CS 212 - Lab 2");
        System.out.println("This program generates 10 lottery tickets.");
        
        System.out.print("What's your name? ");

        String customerName = input.nextLine();

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 6; j++) {
                System.out.print(String.format("%02d", (int)(Math.random() * (99 + 1))) + " ");
            }
            System.out.print("\n");
        }

        System.out.println("-".repeat(18));

        DecimalFormat formatter = new DecimalFormat("#,###");
        System.out.println("$" + formatter.format(prize));

        System.out.println("-".repeat(18));
    }
}
