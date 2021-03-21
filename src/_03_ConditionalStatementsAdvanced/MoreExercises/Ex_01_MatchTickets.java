package _03_ConditionalStatementsAdvanced.MoreExercises;

import java.util.Scanner;

public class Ex_01_MatchTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String category = scanner.nextLine();
        int people = Integer.parseInt(scanner.nextLine());

        double ticket = 0;
        double costs;

        switch (category) {
            case "VIP":
                ticket = 499.99;
                break;
            case "Normal":
                ticket = 249.99;
                break;
        }
        if (people >= 1 && people <= 4) {
            costs = budget * 0.75;
        } else if (people >= 5 && people <= 9) {
            costs = budget * 0.6;
        } else if (people >= 10 && people <= 24) {
            costs = budget * 0.5;
        } else if (people >= 25 && people <= 49) {
            costs = budget * 0.4;
        } else {
            costs = budget * 0.25;
        }

        double approval = budget - costs;
        double sum = ticket * people;
        double money = budget - costs - (ticket * people);

        if (approval >= sum) {
            System.out.printf("Yes! You have %.2f leva left.", Math.abs(money));
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", Math.abs(money));
        }
    }
}