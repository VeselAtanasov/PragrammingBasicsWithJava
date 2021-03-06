package _04_ForLoop.Lab;

import java.util.Scanner;

public class Ex_08_NumberSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int smallest = Integer.MAX_VALUE;
        int biggest = Integer.MIN_VALUE;
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n ; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            if (num < smallest) smallest = num;
            if (num > biggest) biggest = num;
        }

        System.out.printf("Max number: %d%n", biggest);
        System.out.printf("Min number: %d", smallest);
    }
}
