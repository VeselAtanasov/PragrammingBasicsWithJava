package _02_ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class Ex_08_FuelTankTwo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fuel = scanner.nextLine();
        double amount = Double.parseDouble(scanner.nextLine());
        String club = scanner.nextLine();

        double price = 0;
        boolean isValid = club.equals("Yes");

        if (isValid && fuel.equals("Gas")) {
            price = amount * 0.85;
        } else if (isValid && fuel.equals("Gasoline")) {
            price = amount * 2.04;
        } else if (isValid && fuel.equals("Diesel")) {
            price = amount * 2.21;
        } else if (!isValid && fuel.equals("Gas")) {
            price = amount * 0.93;
        } else if (!isValid && fuel.equals("Gasoline")) {
            price = amount * 2.22;
        } else if (!isValid && fuel.equals("Diesel")) {
            price = amount * 2.33;
        }

        if (amount >= 20 && amount <= 25) {
            double finalPrice = price - (price * 0.08);
            System.out.printf("%.2f lv.", finalPrice);
        } else if (amount > 25) {
            double finalPrice = price - (price * 0.1);
            System.out.printf("%.2f lv.", finalPrice);
        } else {
            System.out.printf("%.2f lv.", price);
        }
    }
}
