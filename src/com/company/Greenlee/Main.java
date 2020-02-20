package com.company.Greenlee;

import java.util.Scanner;

// Trenton Greenlee.
// 2.18.2020
// Exercise 6

class UserInput {
    // Scanner
    Scanner input = new Scanner(System.in);

    // Methods

    // promptInt() - prompts user to input an integer but will keep prompting if the user input's data type is incorrect.
    public void promptInt() {
        boolean isInt = true;
        System.out.println("Enter an integer: ");

        while (isInt) {
            try {
                String userInput = input.nextLine();
                Integer.parseInt(userInput);
                isInt = false;
            } catch (Exception e) {
                System.out.println("That is not a valid integer, please try again: ");
                isInt = true;
            }
        }
        System.out.println("Integer Accepted.");
    }

    // promptDouble() - prompts user to input an double but will keep prompting if the user input's data type is incorrect.
    public void promptDouble() {
        boolean isDouble = true;
        System.out.println("Enter a double: ");
        String userInput = input.nextLine();

        while (isDouble) {
            try {
                Integer.parseInt(userInput);
                System.out.println("That is not a valid double, please try again: ");
                userInput = input.nextLine();
                isDouble = true;
            } catch (NumberFormatException e) {
                try {
                    Double.parseDouble(userInput);
                    isDouble = false;
                } catch (NumberFormatException e1) {
                    System.out.println("That is not a valid double, please try again: ");
                    userInput = input.nextLine();
                    isDouble = true;
                }
            }
        }
        System.out.println("Double Accepted.");
    }

    // promptString() - prompts user to input a String but will keep prompting if the user input's data type is incorrect.
    public void promptString() {
        boolean string = true;
        System.out.println("Enter a string: ");

        while (string) {
            try {
                String userInput = input.nextLine();
                Double.parseDouble(userInput);
                System.out.println("That is not a valid string, please try again: ");
                string = true;
            } catch (NumberFormatException e) {
                System.out.println("String accepted.");
                string = false;
            }
        }
    }
}


public class Main {
    public static void main(String[] args) {
        UserInput input = new UserInput();
        // Calling all prompts.
        input.promptInt();
        input.promptDouble();
        input.promptString();
    }
}
