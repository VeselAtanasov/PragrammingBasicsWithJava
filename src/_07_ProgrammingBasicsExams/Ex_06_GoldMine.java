package _07_ProgrammingBasicsExams;

import java.util.Scanner;

public class Ex_06_GoldMine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int locations = Integer.parseInt(scanner.nextLine());

        int goldPerDay;
        int counter = 0;
        double gold;

        while (counter != locations) {

            int averageEx = Integer.parseInt(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            counter++;
            gold = 0;

            for (int i = 1; i <= days; i++) {
                goldPerDay = Integer.parseInt(scanner.nextLine());
                gold += goldPerDay;
            }
            double average = gold / days;
            double diff = averageEx - average;

            if (average >= averageEx) {
                System.out.printf("Good job! Average gold per day: %.2f.%n", average);
            } else {
                System.out.printf("You need %.2f gold.\n", diff);
            }
        }
    }
}