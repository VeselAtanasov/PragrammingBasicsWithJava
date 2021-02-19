package ConditionalStatementsAdvancedLab;

import java.util.Scanner;

public class TradeCommissions12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String city = scanner.nextLine();
        double sells = Double.parseDouble(scanner.nextLine());
        double commission;

        boolean town = "Sofia".equals(city) || "Varna".equals(city) || "Plovdiv".equals(city);
        if (!town){
            System.out.println("error");
        }

        if (city.equals("Sofia")) {
            if (sells >= 0 && sells <= 500) {
                commission = 0.05;
                System.out.printf("%.2f", sells * commission);
            } else if (sells > 500 && sells <= 1000) {
                commission = 0.07;
                System.out.printf("%.2f", sells * commission);
            } else if (sells > 1000.00 && sells <= 10000) {
                commission = 0.08;
                System.out.printf("%.2f", sells * commission);
            } else if (sells > 10000) {
                commission = 0.12;
                System.out.printf("%.2f", sells * commission);
            } else {
                System.out.println("error");
            }
        }

        if (city.equals("Varna")) {
            if (sells >= 0 && sells <= 500.00) {
                commission = 0.045;
                System.out.printf("%.2f", sells * commission);
            } else if (sells > 500.00 && sells <= 1000) {
                commission = 0.075;
                System.out.printf("%.2f", sells * commission);
            } else if (sells > 1000 && sells <= 10000) {
                commission = 0.10;
                System.out.printf("%.2f", sells * commission);
            } else if (sells > 10000) {
                commission = 0.13;
                System.out.printf("%.2f", sells * commission);
            } else {
                System.out.println("error");
            }
        }
        if (city.equals("Plovdiv")) {
            if (sells >= 0 && sells <= 500) {
                commission = 0.055;
                System.out.printf("%.2f", sells * commission);
            } else if (sells > 500 && sells <= 1000) {
                commission = 0.08;
                System.out.printf("%.2f", sells * commission);
            } else if (sells > 1000 && sells <= 10000) {
                commission = 0.12;
                System.out.printf("%.2f", sells * commission);
            } else if (sells > 10000) {
                commission = 0.145;
                System.out.printf("%.2f", sells * commission);
            } else {
                System.out.println("error");
            }
        }
    }
}
