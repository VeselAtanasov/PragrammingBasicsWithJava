package ConditionalStatementsExercise;

import java.util.Scanner;

public class GodzillaVsKong06 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        int personal = Integer.parseInt(scan.nextLine());
        double priceForOnePerson = Double.parseDouble(scan.nextLine());

        double decor = budget * 0.10;

        if (personal > 150) {
            priceForOnePerson = priceForOnePerson - (priceForOnePerson * 0.10);
        }
        double clothes = personal * priceForOnePerson;
        double neededMoney = Math.abs(budget - (decor + clothes));
        double sum = decor + clothes;

        if (sum > budget) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", neededMoney);
        } else {
                System.out.println("Action!");
                System.out.printf("Wingard starts filming with %.2f leva left.", neededMoney);
            }
        }
    }

