package NestedLoopsMoreExercises;

import java.util.Scanner;

public class WeddingSeats06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lastSector = scanner.nextLine().charAt(0);
        int lines = Integer.parseInt(scanner.nextLine());
        int seatsOdd = Integer.parseInt(scanner.nextLine());

        int seatsEven = seatsOdd + 2;
        int sumSeats = 0;

        for (int i = 65; i <= lastSector; i++) {
            for (int j = 1; j <= lines; j++) {
                if (j % 2 != 0) {
                    for (int k = 97; k < (97 + seatsOdd); k++) {
                        sumSeats++;
                        System.out.printf("%c%d%c%n", i, j, k);
                    }
                } else {
                    for (int k = 97; k < (97 + seatsEven); k++) {
                        sumSeats++;
                        System.out.printf("%c%d%c%n", i, j, k);
                    }
                }
            } lines++;
        }
        System.out.println(sumSeats);
    }
}