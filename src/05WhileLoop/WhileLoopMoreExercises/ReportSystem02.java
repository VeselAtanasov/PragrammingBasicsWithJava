package WhileLoopMoreExercises;

import java.util.Scanner;

public class ReportSystem02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();
        int cash = 0;
        int card = 0;
        int counter = 0;
        int transCard = 0;
        int transCash = 0;

        while (!input.equals("End")) {
            counter++;
            int itemPrice = Integer.parseInt(input);

            if (counter % 2 == 0) {
                if (itemPrice < 10) {
                    System.out.println("Error in transaction!");
                } else {
                    transCard++;
                    card += itemPrice;
                    System.out.println("Product sold!");
                }
            } else {
                if (itemPrice > 100) {
                    System.out.println("Error in transaction!");
                } else {
                    transCash++;
                    cash += itemPrice;
                    System.out.println("Product sold!");
                }
            }
            if ((cash + card) >= sum) {
                break;
            }
            input = scanner.nextLine();
        }

        if (input.equals("End")) {
            System.out.println("Failed to collect required money for charity.");
        } else {
            double totalSumCash = cash * 1.0 / transCash;
            double totalSumCard = card * 1.0 / transCard;
            System.out.printf("Average CS: %.2f\n", totalSumCash);
            System.out.printf("Average CC: %.2f", totalSumCard);
        }
    }
}