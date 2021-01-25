package FirstStepsInCodingExercise;

import java.util.Scanner;

public class DepositCalculator07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double depositSum = Double.parseDouble(scanner.nextLine());
        int months = Integer.parseInt(scanner.nextLine());
        double interestRate = Double.parseDouble(scanner.nextLine());

        double interest = depositSum * interestRate / 100;
        double sumPerMonth = interest / 12;
        double totalSum = depositSum + months * sumPerMonth;


        System.out.println(totalSum);
    }
}
