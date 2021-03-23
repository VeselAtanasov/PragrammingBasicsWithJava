package _07_ProgrammingBasicsExams;

import java.util.Scanner;

public class Ex_03_WorldSnookerChampionship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stage = scanner.nextLine();
        String ticketType = scanner.nextLine();
        int ticketsA = Integer.parseInt(scanner.nextLine());
        String photo = scanner.nextLine();

        double ticketPrice = 0;

        switch (stage) {
            case "Quarter final":
                if (ticketType.equals("Standard")) {
                    ticketPrice = 55.50;
                } else if (ticketType.equals("Premium")) {
                    ticketPrice = 105.20;
                } else {
                    ticketPrice = 118.90;
                }
                break;
            case "Semi final":
                if (ticketType.equals("Standard")) {
                    ticketPrice = 75.88;
                } else if (ticketType.equals("Premium")) {
                    ticketPrice = 125.22;
                } else {
                    ticketPrice = 300.40;
                }
                break;
            case "Final":
                if (ticketType.equals("Standard")) {
                    ticketPrice = 110.10;
                } else if (ticketType.equals("Premium")) {
                    ticketPrice = 160.66;
                } else {
                    ticketPrice = 400;
                }
                break;
        }
        double ticketSum = ticketPrice * ticketsA;
        double photoSum;
        double total = ticketSum;
        if (photo.equals("Y")) {
            photoSum = ticketsA * 40;
        } else {
            photoSum = 0;
        }
        if (ticketSum > 4000) {
            total = ticketSum * 0.75;
            if (photo.equals("Y")) {
                photoSum = 0;
            }
        } else if (ticketSum > 2500) {
            total = ticketSum * 0.9;
        }
        total += photoSum;
        System.out.printf("%.2f", total);

    }
}
