package NestedConditionalStatementsMoreExercises;

import java.util.Scanner;

public class MultiplyBy2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var number = Double.parseDouble(scanner.nextLine());

        while (number >= 0) {
            var multipleByTwo = number * 2;

            System.out.printf("Result: %.2f\n", multipleByTwo);

            number = Double.parseDouble(scanner.nextLine());

        } System.out.println("Negative number!");
    }
}