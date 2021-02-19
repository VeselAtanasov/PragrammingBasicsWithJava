package NestedLoopsExercises;

import java.util.Scanner;

public class EqualSumsEvenOddPosition02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());

        for (int i = n1; i <= n2 ; i++) {
            int evenSum = 0;
            int oddSum = 0;
            int currentNumber = i;
            for (int pos = 6; pos >= 1; pos--) {
                int digit = currentNumber % 10;
                currentNumber /= 10;
                if (pos % 2 == 0) {
                    evenSum += digit;
                } else {
                    oddSum += digit;
                }
            }
            if (evenSum == oddSum) {
                System.out.print(i + " ");
            }
        }
    }
}
