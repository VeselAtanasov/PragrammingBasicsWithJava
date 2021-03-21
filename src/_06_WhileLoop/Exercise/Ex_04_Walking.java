package _06_WhileLoop.Exercise;

import java.util.Scanner;

public class Ex_04_Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = "";
        int step = 0;
        while (step < 10000 && !"Going home".equals(input = scanner.nextLine())) {
            step += Integer.parseInt(input);
        }

        if ("Going home".equals(input)) {
            step += Integer.parseInt(scanner.nextLine());
        }

        if (step < 10000) {
            System.out.printf("%d more steps to reach goal.", 10000 - step);
        } else {
            System.out.printf("Goal reached! Good job!%n%d steps over the goal!", step - 10000);
        }
    }
}