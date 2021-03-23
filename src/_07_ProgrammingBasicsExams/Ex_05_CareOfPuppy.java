package _07_ProgrammingBasicsExams;

import java.util.Scanner;

public class Ex_05_CareOfPuppy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int food = Integer.parseInt(scanner.nextLine());
        String amount = scanner.nextLine();

        int foodPerDay = 0;
        int foodGrams = food * 1000;


        while (!amount.equals("Adopted")) {
            foodPerDay += Integer.parseInt(amount);

            amount = scanner.nextLine();

        }

        int diff = Math.abs(foodPerDay - foodGrams);
        if (foodPerDay <= foodGrams) {
            System.out.printf("Food is enough! Leftovers: %d grams.", diff);
        } else {
            System.out.printf("Food is not enough. You need %d grams more.", diff);

        }
    }
}
