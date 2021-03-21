package _03_ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class Ex_01_Cinema {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String projection = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());

        double income = 0;

        if ("Premiere".equals(projection)){
            income = rows * columns * 12;
        } else if ("Normal".equals(projection)){
            income = rows * columns * 7.50;
        } else if ("Discount".equals(projection)){
            income = rows * columns * 5;
        }
        System.out.printf("%.2f leva",income);

    }
}
