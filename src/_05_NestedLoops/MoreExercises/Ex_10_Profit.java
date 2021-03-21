package _05_NestedLoops.MoreExercises;

import java.util.Scanner;

public class Ex_10_Profit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bgnFirst = Integer.parseInt(scanner.nextLine());
        int bgnSecond = Integer.parseInt(scanner.nextLine());
        int bgnFifth = Integer.parseInt(scanner.nextLine());
        int bgnTotal = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <= bgnFirst; i++) {
            for (int j = 0; j <= bgnSecond; j++) {
                for (int k = 0; k <= bgnFifth; k++) {
                    int sum = i + j * 2 + k * 5;
                    if (sum == bgnTotal) {
                        System.out.printf("%d * 1 lv. + %d * 2 lv. + %d * 5 lv. = %d lv.\n", i, j, k, bgnTotal);
                    }
                }
            }
        }
    }
}
