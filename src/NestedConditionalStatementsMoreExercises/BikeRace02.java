package NestedConditionalStatementsMoreExercises;

import java.util.Scanner;

public class BikeRace02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int juniors = Integer.parseInt(scanner.nextLine());
        int seniors = Integer.parseInt(scanner.nextLine());
        String trace = scanner.nextLine();

        double tax = 0;
        double tax2 = 0;
        double all = juniors + seniors;

        switch (trace) {
            case "trail":
                tax = juniors * 5.50;
                tax2 = seniors * 7;
                break;

            case "cross-country":
                if (all < 50) {
                    tax = juniors * 8;
                    tax2 = seniors * 9.50;
                } else {
                    tax = juniors * 8 * 0.75;
                    tax2 =seniors * 9.50 * 0.75;
                } break;

            case "downhill":
                tax = juniors * 12.25;
                tax2 = seniors * 13.75;
                break;

            case "road":
                tax = juniors * 20;
                tax2 = seniors * 21.50;
                break;
        }
        double expense = (tax + tax2) * 0.05;
        double donation = (tax + tax2) - expense;
        System.out.printf("%.2f", donation);
    }
}