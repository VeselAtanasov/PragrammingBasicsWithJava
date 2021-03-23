package _07_ProgrammingBasicsExams;

import java.util.Scanner;

public class Ex_01_ProgrammingBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceOnePage = Double.parseDouble(scanner.nextLine());
        double priceOneCover = Double.parseDouble(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());
        double design = Double.parseDouble(scanner.nextLine());
        int percentSum = Integer.parseInt(scanner.nextLine());

        double firstSum = (priceOnePage * 899) + (priceOneCover * 2);
        double discountTotal = firstSum - (firstSum * discount / 100);
        double designPrice = discountTotal + design;
        double totalSum = designPrice - (designPrice * percentSum / 100);

        System.out.printf("Avtonom should pay %.2f BGN.", totalSum);
    }
}
