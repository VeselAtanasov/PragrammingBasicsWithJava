package ProgrammingBasicsExams;

import java.util.Scanner;

public class Ex_06_VetParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        double total = 0;

        for (int i = 1; i <= days; i++) {
            double taxParking = 0;
            for (int j = 1; j <= hours ; j++) {
                if (i % 2 == 0 && j % 2 != 0) {
                    taxParking += 2.50;
                } else if (i % 2 != 0 && j % 2 == 0) {
                    taxParking += 1.25;
                } else {
                    taxParking += 1;
                }
            }
            total += taxParking;
            System.out.printf("Day: %d - %.2f leva\n",i, taxParking);
        }
        System.out.printf("Total: %.2f leva", total);
    }
}