package _06_WhileLoop.MoreExercises;

import java.util.Scanner;

public class Ex_05_AverageNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            sum += number;
        }
        double average = sum * 1.0 / n;
        System.out.printf("%.2f%n", average);

    }
}
