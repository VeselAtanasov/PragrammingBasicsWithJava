package ProgrammingBasicsOnlineExam;

import java.util.Scanner;

public class EasterBake05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bread = Integer.parseInt(scanner.nextLine());

        double sugarA = 0;
        double flourA = 0;
        int maxSugar = Integer.MIN_VALUE;
        int maxFlour = Integer.MIN_VALUE;

        for (int i = 1; i <= bread; i++) {
            int sugar = Integer.parseInt(scanner.nextLine());
            sugarA += sugar;
            if (sugar > maxSugar) {
                maxSugar = sugar;
            }
            int flour = Integer.parseInt(scanner.nextLine());
            flourA += flour;
            if (flour > maxFlour) {
                maxFlour = flour;
            }
        }
            double sugarPack = sugarA / 950;
            double flourPack = flourA / 750;

            System.out.printf("Sugar: %.0f\n", Math.ceil(sugarPack));
            System.out.printf("Flour: %.0f\n", Math.ceil(flourPack));
            System.out.printf("Max used flour is %d grams, max used sugar is %d grams.", maxFlour, maxSugar);
        }
    }
