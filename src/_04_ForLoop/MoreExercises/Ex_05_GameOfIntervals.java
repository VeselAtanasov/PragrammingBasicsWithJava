package _04_ForLoop.MoreExercises;

import java.util.Scanner;

public class Ex_05_GameOfIntervals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int moves = Integer.parseInt(scanner.nextLine());
        double result = 0;
        double n9 = 0;
        double n19 = 0;
        double n29 = 0;
        double n39 = 0;
        double n50 = 0;
        double invalid = 0;

        for (int i = 1; i <= moves; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number >= 0 && number <= 9) {
                n9++;
                result += (number * 0.2);
            } else if (number >= 10 && number <= 19) {
                n19++;
                result += (number * 0.3);
            } else if (number >= 20 && number <= 29) {
                n29++;
                result += (number * 0.4);
            } else if (number >= 30 && number <= 39) {
                n39++;
                result += 50;
            } else if (number >= 40 && number <= 50) {
                n50++;
                result += 100;
            } else {
                invalid++;
                result /= 2;
            }
        }
        double invalidPercent = invalid / moves * 100;
        double n9Percent = n9 / moves * 100;
        double n19Percent = n19 / moves * 100;
        double n29Percent = n29 / moves * 100;
        double n39Percent = n39 / moves * 100;
        double n50Percent = n50 / moves * 100;

        System.out.printf("%.2f\n", result);
        System.out.printf("From 0 to 9: %.2f%%\n", n9Percent);
        System.out.printf("From 10 to 19: %.2f%%\n", n19Percent);
        System.out.printf("From 20 to 29: %.2f%%\n", n29Percent);
        System.out.printf("From 30 to 39: %.2f%%\n", n39Percent);
        System.out.printf("From 40 to 50: %.2f%%\n", n50Percent);
        System.out.printf("Invalid numbers: %.2f%%", invalidPercent);

    }
}
