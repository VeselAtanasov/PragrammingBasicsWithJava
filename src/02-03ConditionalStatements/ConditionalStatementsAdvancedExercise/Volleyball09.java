package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class Volleyball09 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String year = scanner.nextLine();
        int holidays = Integer.parseInt(scanner.nextLine());
        int homeWeekends = Integer.parseInt(scanner.nextLine());

        double restW = (48 - homeWeekends) * 3.0 / 4;
        double hGames = holidays * 2.0 / 3;
        double sum = hGames + restW + homeWeekends;


        if (year.equals("leap")) {
            sum = (hGames + restW + homeWeekends) * 1.15;
        }
        System.out.printf("%.0f", Math.floor(sum));
    }
}

