package _07_ProgrammingBasicsExams;

import java.util.Scanner;

public class Ex_03_TravelAgency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String town = scanner.nextLine();
        String pack = scanner.nextLine();
        String vip = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());

        double price = 0;

        switch (town) {
            case "Bansko":
            case "Borovets":
                switch (pack) {
                    case "withEquipment":
                        price = 100;
                        if (vip.equals("yes")) {
                            price *= 0.9;
                        }
                        break;

                    case "noEquipment":
                        price = 80;
                        if (vip.equals("yes")) {
                            price *= 0.95;
                        }
                        break;
                }

            case "Varna":
            case "Burgas":

                if ("withBreakfast".equals(pack)) {
                    price = 130;
                    if (vip.equals("yes")) {
                        price *= 0.88;
                    }
                } else if ("noBreakfast".equals(pack)) {
                    price = 100;
                    if (vip.equals("yes")) {
                        price *= 0.93;
                    }
                }
        }

        double priceSum = price * days;
        if (days > 7) {
            priceSum = priceSum - price;
        }
        if (days < 1) {
            System.out.println("Days must be positive number!");
        } else if (!town.equals("Bansko") && !town.equals("Borovets") && !town.equals("Varna") && !town.equals("Burgas")
                || !pack.equals("noEquipment") && !pack.equals("withEquipment") && !pack.equals("noBreakfast") && !pack.equals("withBreakfast")) {
            System.out.println("Invalid input!");
        } else {
            System.out.printf("The price is %.2flv! Have a nice time!", priceSum);
        }
    }
}