package _05_NestedLoops.MoreExercises;

import java.util.Scanner;

public class Ex_13_PrimePairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int diffFirst = Integer.parseInt(scanner.nextLine());
        int diffSecond = Integer.parseInt(scanner.nextLine());

        for (int i = first; i <= (first + diffFirst); i++) {
            for (int j = second; j <= (second + diffSecond); j++) {
                if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0 && j % 2 != 0 && j % 3 != 0 && j % 5 != 0 && j % 7 != 0) {
                    System.out.printf("%d%d\n", i, j);
                }
            }
        }
    }
}
