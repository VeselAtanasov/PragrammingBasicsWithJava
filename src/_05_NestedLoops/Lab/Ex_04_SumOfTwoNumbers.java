package _05_NestedLoops.Lab;

import java.util.Scanner;

public class Ex_04_SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int magical = Integer.parseInt(scanner.nextLine());
        boolean flag = false;

        int sum;
        int counter = 0;

        for (int i = start; i <= end; i++) {
            for (int j = start; j <= end; j++) {
                sum = i + j;
                counter++;

                if (magical == sum) {
                    System.out.printf("Combination N:%d (%d + %d = %d)", counter, i, j, magical);
                    flag = true;
                    break;
                }
            }

            if (flag) {
                break;
            }
        }
        if (!flag) {
            System.out.printf("%d combinations - neither equals %d\n", counter, magical);

        }
    }
}
