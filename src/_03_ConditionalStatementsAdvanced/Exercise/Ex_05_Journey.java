package _03_ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class Ex_05_Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        double expenses = 0;
        String destination;
        String accommodation = "";
        // Проверка на бюджет

        if (budget <= 100) {
            destination = "Bulgaria";
            switch (season) {
                case "summer":
                    expenses = budget * 0.30;
                    accommodation = "Camp";
                    break;
                case "winter":
                    expenses = budget * 0.70;
                    accommodation = "Hotel";
                    break;
            }
        } else if (budget <= 1000) {
            destination = "Balkans";
            switch (season) {
                case "summer":
                    expenses = budget * 0.40;
                    accommodation = "Camp";
                    break;
                case "winter":
                    expenses = budget * 0.80;
                    accommodation = "Hotel";
                    break;
            }

        } else {
            destination = "Europe";
            accommodation = "Hotel";
            expenses = budget * 0.90;

            // Принтиране
        }
        System.out.printf("Somewhere in %s%n", destination);
        System.out.printf("%s - %.2f", accommodation, expenses);
    }
}
