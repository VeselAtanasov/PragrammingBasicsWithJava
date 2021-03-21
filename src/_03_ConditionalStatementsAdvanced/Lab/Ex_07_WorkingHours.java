package _03_ConditionalStatementsAdvanced.Lab;

import java.util.Scanner;

public class Ex_07_WorkingHours {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int hour = Integer.parseInt(scan.nextLine());
        String day = scan.nextLine();


        if (hour >= 10 && hour <= 18) {
            if (day.equals("Monday") ||
                    day.equals("Tuesday") ||
                    day.equals("Wednesday") ||
                    day.equals("Thursday") ||
                    day.equals("Friday") ||
                    day.equals("Saturday")) {
                System.out.println("open");
            } else {
                System.out.println("closed");
            }
        } else {
            System.out.println("closed");
        }
    }
}
