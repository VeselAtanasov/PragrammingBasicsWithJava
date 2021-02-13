package NestedLoopsLab;

import java.util.Scanner;

public class CinemaTickets07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumTicketALlMovie = 0;
        int studentCount = 0;
        int standardCount = 0;
        int kidCount = 0;

        while (true) {
            String movieName = scanner.nextLine();
            if (movieName.equals("Finish")) {
                break;
            }
            int freeSeats = Integer.parseInt(scanner.nextLine());

            int countALLMovieTicket = 0;
            int countFreeSeats = freeSeats;
            while (countFreeSeats > 0) {
                String type = scanner.nextLine();

                if (type.equals("End")) {
                    break;
                }

                switch (type) {
                    case "student":
                        studentCount++;
                        break;
                    case "standard":
                        standardCount++;
                        break;
                    case "kid":
                        kidCount++;
                        break;
                }
                countFreeSeats--;
                countALLMovieTicket++;
            }

            sumTicketALlMovie += countALLMovieTicket;

            double percentTakeSeats = (1.0 * countALLMovieTicket) / freeSeats * 100;
            System.out.printf("%s - %.2f%% full.\n", movieName, percentTakeSeats);
        }

        System.out.printf("Total tickets: %d\n", sumTicketALlMovie);
        System.out.printf("%.2f%% student tickets.\n", studentCount * 1.0 / sumTicketALlMovie * 100);
        System.out.printf("%.2f%% standard tickets.\n", standardCount * 1.0 / sumTicketALlMovie * 100);
        System.out.printf("%.2f%% kids tickets.\n", kidCount * 1.0 / sumTicketALlMovie * 100);
    }
}
