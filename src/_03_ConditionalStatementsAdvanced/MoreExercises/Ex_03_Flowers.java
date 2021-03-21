package _03_ConditionalStatementsAdvanced.MoreExercises;

import java.util.Scanner;

public class Ex_03_Flowers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chrysanthemums = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int tulips = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        String holiday = scanner.nextLine();

        double sumCh = 0;
        double sumR = 0;
        double sumT = 0;


        switch (season) {
            case "Spring":
            case "Summer":
                sumCh = 2 * chrysanthemums;
                sumR = 4.10 * roses;
                sumT = 2.50 * tulips;
                break;

            case "Autumn":
            case "Winter":
                sumCh = 3.75 * chrysanthemums;
                sumR = 4.50 * roses;
                sumT = 4.15 * tulips;
                break;
        }
        double sum = sumCh + sumR + sumT;
        double amount = chrysanthemums + roses + tulips;
        if (holiday.equals("Y")) {
            sum *= 1.15;
        }
        if (tulips > 7 && season.equals("Spring")) {
            sum *= 0.95;
        }
        if (roses >= 10 && season.equals("Winter")) {
            sum *= 0.9;
        }
        if (amount > 20) {
            sum *= 0.8;
        }
        double total = sum + 2;
        System.out.printf("%.2f", total);

    }
}
