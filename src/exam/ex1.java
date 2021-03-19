package exam;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int priceVideo = Integer.parseInt(scanner.nextLine());
        int priceAux = Integer.parseInt(scanner.nextLine());
        double electricity = Double.parseDouble(scanner.nextLine());
        double profit = Double.parseDouble(scanner.nextLine());

        int totalSumVideo = priceVideo * 13;
        int totalAux = priceAux * 13;
        int allMoney = totalSumVideo + totalAux + 1000;
        double moneyDay = profit - electricity;
        double allMoneyDay = 13 * moneyDay;
        double invest = Math.ceil(allMoney / allMoneyDay);

        System.out.printf("%d\n", allMoney);
        System.out.printf("%.0f", invest);
    }
}
