package _05_NestedLoops.MoreExercises;

import java.util.Scanner;

public class Ex_09_SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int stop = Integer.parseInt(scanner.nextLine());
        int number = Integer.parseInt(scanner.nextLine());

        int counter = 0;
        boolean isFirst = false;

        for (int i = start; i <= stop; i++) {
            for (int j = start; j <= stop; j++) {
                counter++;
                if (i + j == number) {
                    System.out.printf("Combination N:%d (%d + %d = %d)", counter, i, j, number);
                    isFirst = true;
                    break;
                }
            }
            if (isFirst) {
                break;
            }
        }
        if (!isFirst) {
            System.out.printf("%d combinations - neither equals %d", counter, number);
        }
    }
}
