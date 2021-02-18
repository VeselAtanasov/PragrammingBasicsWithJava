package NestedConditionalStatementsMoreExercises;

import java.util.Scanner;

public class CarToGo04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String type = "";
        String car = "";

        switch (season) {
            case "Summer":
                if (budget <= 100) {
                    type = "Economy class";
                    car = "Cabrio";
                    budget *= 0.35;
                }else if (budget > 100 && budget <= 500) {
                    type = "Compact class";
                    car = "Cabrio";
                    budget *= 0.45;
                } else {
                    type = "Luxury class";
                    car = "Jeep";
                    budget *= 0.9;
                } break;

            case "Winter":
                if (budget <= 100) {
                    type = "Economy class";
                    car = "Jeep";
                    budget *= 0.65;
                }else if (budget > 100 && budget <= 500) {
                    type = "Compact class";
                    car = "Jeep";
                    budget *= 0.8;
                } else {
                    type = "Luxury class";
                    car = "Jeep";
                    budget *= 0.9;
                } break;

            } System.out.printf("%s\n%s - %.2f", type, car, budget);
        }
    }
