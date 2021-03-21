package _02_ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class Ex_07_FlowerShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int magnolia = Integer.parseInt(scanner.nextLine());
        int hyacinth = Integer.parseInt(scanner.nextLine());
        int rose = Integer.parseInt(scanner.nextLine());
        int cactus = Integer.parseInt(scanner.nextLine());
        double present = Double.parseDouble(scanner.nextLine());

        double magnoliaPrice = magnolia * 3.25;
        double hyacinthPrice = hyacinth * 4;
        double rosePrice = rose * 3.50;
        double cactusPrice = cactus * 8;

        double sum = magnoliaPrice + hyacinthPrice + rosePrice + cactusPrice;
        double tax = sum * 0.05;
        double total = sum - tax;

        boolean isValid = total >= present;

        if (isValid) {
            double moneyExtra = total - present;
            System.out.printf("She is left with %.0f leva.", Math.floor(moneyExtra));
        } else {
            double moneyNeeded = present - total;
            System.out.printf("She will have to borrow %.0f leva.", Math.ceil(moneyNeeded));
        }
    }
}
