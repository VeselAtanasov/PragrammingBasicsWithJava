package exam;

import java.util.Scanner;

public class PuppyCare05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int food = Integer.parseInt(scanner.nextLine());
        String amount = scanner.nextLine();

        int totalFood = food * 1000;
        int sum = 0;

        while (!amount.equals("Adopted")) {
            sum += Integer.parseInt(amount);
            amount = scanner.nextLine();
        }
        int diff = Math.abs(totalFood - sum);
        if (sum <= totalFood) {
            System.out.printf("Food is enough! Leftovers: %d grams.", diff);
        } else {
            System.out.printf("Food is not enough. You need %d grams more.", diff);
        }
    }
}