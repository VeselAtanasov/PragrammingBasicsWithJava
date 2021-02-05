package ProgrammingBasicsOnlineExam;

import java.util.Scanner;

public class FitnessCenter05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int series = Integer.parseInt(scanner.nextLine());
        double sum = 0;

        for (int i = 1; i <= series; i++) {
            String nameSeries = scanner.nextLine();
            double price = Double.parseDouble(scanner.nextLine());


            if (nameSeries.equals("Thrones")) {
                price *= 0.5;
            } else if (nameSeries.equals("Lucifer")) {
                price *= 0.6;
            } else if (nameSeries.equals("Protector")) {
                price *= 0.7;
            } else if (nameSeries.equals("TotalDrama")) {
                price *= 0.8;
            } else if (nameSeries.equals("Area")) {
                price *= 0.9;
            }
            sum += price;
        }
        double moneyNeed = Math.abs(sum - budget);
        if (budget >= sum){
            System.out.printf("You bought all the series and left with %.2f lv.\n", moneyNeed);
         } else {
            System.out.printf("You need %.2f lv. more to buy the series!", moneyNeed);
        }
    }
}
