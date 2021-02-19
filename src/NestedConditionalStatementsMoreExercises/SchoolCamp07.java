package NestedConditionalStatementsMoreExercises;

import java.util.Scanner;

public class SchoolCamp07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        String group = scanner.nextLine();
        int students = Integer.parseInt(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());

        double price = 0;
        String sport = "";

        switch (season) {
            case "Winter":
                switch (group) {
                    case "boys":
                        price = 9.60 * nights;
                        sport = "Judo";
                        break;
                    case "girls":
                        price = 9.60 * nights;
                        sport = "Gymnastics";
                        break;
                    case "mixed":
                        price = 10 * nights;
                        sport = "Ski";
                        break;
                }
                break;

            case "Spring":
                switch (group) {
                    case "boys":
                        price = 7.20 * nights;
                        sport = "Tennis";
                        break;
                    case "girls":
                        price = 7.20 * nights;
                        sport = "Athletics";
                        break;
                    case "mixed":
                        price = 9.50 * nights;
                        sport = "Cycling";
                        break;
                }
                break;

            case "Summer":
                switch (group) {
                    case "boys":
                        price = 15 * nights;
                        sport = "Football";
                        break;
                    case "girls":
                        price = 15 * nights;
                        sport = "Volleyball";
                        break;
                    case "mixed":
                        price = 20 * nights;
                        sport = "Swimming";
                        break;
                }
                break;
        }
        if (students >= 50) {
            price *= 0.5;
        } else if (students >= 20) {
            price *= 0.85;
        } else if (students >= 10) {
            price *= 0.95;
        }
        double total = price * students;
        System.out.printf("%s %.2f lv.", sport, total);


    }
}
