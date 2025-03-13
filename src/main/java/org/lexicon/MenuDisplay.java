package org.lexicon;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class MenuDisplay {

    public static double sekAmount;
    public static double euroAmount;
    public static double usdAmount;


    public static void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        while (true) {
            System.out.println("\n" + "Currency converter app \n" + "Current date and time: " + LocalDateTime.now() + "\n" +
                    "1. Convert SEK to USD\n" +
                    "2. Convert USD to SEK\n" +
                    "3. Convert SEK to Euro\n" +
                    "4. Convert Euro to SEK\n" +
                    "0. Exit " +
                    "Enter your choice: ");
            if (!scanner.hasNextInt()) {
                System.out.println("invalid input! enter a int");
                scanner.next();
                continue;
            }
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("you selected 1. Convert SEK to USD");
                    System.out.println("enter in amount you wish to exchange ");
                    sekAmount = scanner.nextDouble();

                    double sekToUsdResult = sekAmount;
                    System.out.println("You entered an amount of: " + sekToUsdResult);
                    System.out.println("and your change from SEK to USD is with current rate of: " + CurrencyRates.SEK_TO_USD_RATE + "\n"
                            + "your exchange to USD is: " + CurrencyRates.exchangeRateSekToUsd(sekToUsdResult) + "$");

                    break;

                case 2:
                    System.out.println("you selected 2.");
                    break;
                case 3:
                    System.out.println("you selected 3.");
                    break;

                case 4:
                    System.out.println("you selected 4.");
                    break;

                case 0:
                    System.out.println("you selected 0. Exit the program");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option");
            }
        }
    }
}
