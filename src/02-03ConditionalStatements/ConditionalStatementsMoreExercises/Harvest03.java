package ConditionalStatementsMoreExercises;

import java.util.Scanner;

public class Harvest03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //От лозе с площ X квадратни метри се заделя 40% от реколтата за производство на вино. От 1 кв.м лозе се изкарват Y килограма грозде.
        // За 1 литър вино са нужни 2,5 кг. грозде. Желаното количество вино за продан е Z литра.
        //Напишете програма, която пресмята колко вино може да се произведе и дали това количество е достатъчно.
        // Ако е достатъчно, остатъкът се разделя по равно между работниците на лозето.

        int xMetres = Integer.parseInt(scan.nextLine());
        double yMetres = Double.parseDouble(scan.nextLine());
        int neededWine = Integer.parseInt(scan.nextLine());
        int workers = Integer.parseInt(scan.nextLine());

        double totalGrapes = xMetres * yMetres;
        double wine = (totalGrapes - totalGrapes * 0.60) / 2.5;
        double missingWine = Math.abs(wine - neededWine);

        if (wine < neededWine){
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", Math.floor(missingWine));
        } else if (wine >= neededWine){
            double winePlus = (wine - neededWine);
            double litresPerMan = (winePlus / workers);
            System.out.printf("Good harvest this year! Total wine: %.0f liters.\n%.0f liters left -> %.0f liters per person.", Math.floor(wine), Math.ceil(winePlus), Math.ceil(litresPerMan));
        }
    }
}
