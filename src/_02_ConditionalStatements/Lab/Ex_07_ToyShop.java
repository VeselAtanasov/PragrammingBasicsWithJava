package _02_ConditionalStatements.Lab;

import java.util.Scanner;

public class Ex_07_ToyShop {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double priceVacation = Double.parseDouble(scan.nextLine());
        int puzzle = Integer.parseInt(scan.nextLine());
        int speakingDoll = Integer.parseInt(scan.nextLine());
        int teddyBears = Integer.parseInt(scan.nextLine());
        int minions = Integer.parseInt(scan.nextLine());
        int trucks = Integer.parseInt(scan.nextLine());

        double sumPriceToys = (puzzle * 2.60)+(speakingDoll * 3)+(teddyBears * 4.10)+(minions * 8.20)+(trucks * 2);
        double sumToys = puzzle + speakingDoll + teddyBears + minions + trucks;

        if (sumToys >= 50){
            sumPriceToys = sumPriceToys - (sumPriceToys * 0.25);
        }
        sumPriceToys = sumPriceToys - (sumPriceToys * 0.10);

        double diff = Math.abs(priceVacation - sumPriceToys);
        if (sumPriceToys >= priceVacation){
            System.out.printf("Yes! %.2f lv left.", diff);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.",diff);
        }
    }
}