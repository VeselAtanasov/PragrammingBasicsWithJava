package ForLoopLab;

import java.util.Scanner;

public class CleverLily11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double priceWashMachine = Double.parseDouble(scanner.nextLine());
        double priceToy = Double.parseDouble(scanner.nextLine());

        int toy = 0;
        int countBrother = 0;
        int money = 0;
        double sumMoney = 0;

        for (int i = 1; i <= age; i++) {
            if (i % 2 != 0) {
                toy++;
            } else {
                countBrother++;
                money = money + 10;
                sumMoney += money;
            }
        }
        double toysMoney = toy * priceToy;
        double allMoney = toysMoney + sumMoney - countBrother;
        double diff = Math.abs(allMoney - priceWashMachine);

        if (priceWashMachine <= allMoney) {
            System.out.printf("Yes! %.2f", diff);
        } else {

            System.out.printf("No! %.2f", diff);
        }
    }
}
