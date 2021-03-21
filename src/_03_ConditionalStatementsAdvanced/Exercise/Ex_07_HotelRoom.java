package _03_ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class Ex_07_HotelRoom {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());

        double sumStudio = 0;
        double sumAp = 0;

        switch (month) {
            case "May":
            case "October":
                sumAp = nights * 65;
                if (nights > 7 && nights < 14) {
                    sumStudio = (50 * 0.95) * nights;
                } else if (nights > 14) {
                    sumStudio = (50 * 0.7) * nights;
                    sumAp = (65 * 0.9) * nights;
                } else {
                    sumStudio = nights * 50;
                }break;

            case "June":
            case "September":
                if (nights > 14) {
                    sumStudio = (75.20 * 0.8) * nights;
                    sumAp = (68.70 * 0.9) * nights;
                } else {
                    sumStudio = nights * 75.20;
                    sumAp = nights * 68.70;
                }break;

            case "July":
            case "August":
                if (nights > 14) {
                    sumStudio = 76 * nights;
                    sumAp = (77 * 0.9) * nights;
                } else {
                    sumStudio = nights * 76;
                    sumAp = nights * 77;
                }break;
        }
        System.out.printf("Apartment: %.2f lv.\nStudio: %.2f lv.", sumAp, sumStudio);
    }
}