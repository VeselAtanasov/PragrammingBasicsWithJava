package ConditionalStatementsAdvancedLab;

import java.util.Scanner;

public class FruitShop11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String day = scanner.nextLine();
        double amount = Double.parseDouble(scanner.nextLine());


        double price;
        price = 0;
        boolean mToF = "Monday".equals(day) || "Tuesday".equals(day) || "Wednesday".equals(day) || "Thursday".equals(day) || "Friday".equals(day);
        boolean sToS = "Saturday".equals(day) || "Sunday".equals(day);

        if (fruit.equals("banana")) {
            if (mToF) {
                price = 2.50;
            } else if (sToS) {
                price = 2.70;
            }
        }
        if (fruit.equals("apple")) {
            if (mToF) {
                price = 1.20;
            } else if (sToS) {
                price = 1.25;
            }
        }
        if (fruit.equals("orange")) {
            if (mToF) {
                price = 0.85;
            } else if (sToS) {
                price = 0.90;
            }
        }
        if (fruit.equals("grapefruit")) {
            if (mToF) {
                price = 1.45;
            } else if (sToS) {
                price = 1.60;
            }
        }
        if (fruit.equals("kiwi")) {
            if (mToF) {
                price = 2.70;
            } else if (sToS) {
                price = 3.00;
            }
        }
        if (fruit.equals("pineapple")) {
            if (mToF) {
                price = 5.50;
            } else if (sToS) {
                price = 5.60;
            }
        }
        if (fruit.equals("grapes")) {
            if (mToF) {
                price = 3.85;
            } else if (sToS) {
                price = 4.20;
            }
        }
        if (price * amount == 0.00) {
            System.out.println("error");
        } else {
                System.out.printf("%.2f", price * amount);
            }
        }
    }
