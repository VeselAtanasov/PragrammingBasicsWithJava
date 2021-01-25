package ConditionalStatementsAdvancedLab;

import java.util.Scanner;

public class SkiTrip13 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int days = Integer.parseInt(scan.nextLine());
        String type = scan.nextLine();
        String grade = scan.nextLine();
        int nights = days - 1;
        double result = 0;

        if (type.equals("room for one person")) {
            result = 18 * nights;

        } else if (type.equals("apartment")) {
            result = 25 * nights;
            if (days < 10) {
                result = result - (result * 0.3);
            } else if (days < 15) {
                result = result - (result * 0.35);
            } else if (days > 15) {
                result = result * 0.5; }

        } else if (type.equals("president apartment")) {
            result = 35 * nights;
            if (days < 10) {
                result = result - (result * 0.1);
            } else if (days < 15) {
                result = result - (result * 0.15);
            } else if (days > 15) {
                result = result - (result * 0.20);
            }
        }
        if (grade.equals("positive")){
            result = result * 1.25;
        } else {
            result = result * 0.90;
        }

        System.out.printf("%.2f",result);
    }
}

