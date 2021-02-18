package FirstStepsInCodingExercise;

import java.util.Scanner;

public class FruitMarket07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double strwPrice = Double.parseDouble(scanner.nextLine());
        double bananas = Double.parseDouble(scanner.nextLine());
        double oranges = Double.parseDouble(scanner.nextLine());
        double raspberries = Double.parseDouble(scanner.nextLine());
        double strawberries = Double.parseDouble(scanner.nextLine());

        double raspPrice = strwPrice * 0.5;
        double orangesPrice = raspPrice - (raspPrice * 0.4);
        double bananasPrice = raspPrice - (raspPrice * 0.8);

        double sum = (strawberries * strwPrice) + (bananas * bananasPrice) + (oranges * orangesPrice) + (raspberries * raspPrice);
        System.out.printf("%.2f", sum);

    }
}
