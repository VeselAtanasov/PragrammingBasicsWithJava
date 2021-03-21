package _01_FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class Ex_04_VegetableMarket {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double priceVegetables = Double.parseDouble(scan.nextLine());
        double priceFruits = Double.parseDouble(scan.nextLine());
        int totalKgVegetables = Integer.parseInt(scan.nextLine());
        int totalKgFruits = Integer.parseInt(scan.nextLine());

        double priceEuro = 1.94;

        double sumPriceVegetables = priceVegetables * totalKgVegetables;
        double sumPriceFruits = priceFruits * totalKgFruits;

        double sumAll = (sumPriceVegetables + sumPriceFruits) / priceEuro;

        System.out.printf("%.2f",sumAll);

    }
}
