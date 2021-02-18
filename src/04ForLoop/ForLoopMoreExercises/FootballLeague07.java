package ForLoopMoreExercises;

import java.util.Scanner;

public class FootballLeague07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int capacity = Integer.parseInt(scanner.nextLine());
        int fans = Integer.parseInt(scanner.nextLine());

        double fansA = 0;
        double fansB = 0;
        double fansV = 0;
        double fansG = 0;


        for (int i = 1; i <= fans; i++) {
            String sector = scanner.nextLine();
            if (sector.equals("A")) {
                fansA++;
            } else if (sector.equals("B")) {
                fansB++;
            } else if (sector.equals("V")) {
                fansV++;
            } else {
                fansG++;
            }
        }

        double percentA = fansA / fans * 100;
        double percentB = fansB / fans * 100;
        double percentV = fansV / fans * 100;
        double percentG = fansG / fans * 100;
        double percentStadium = 1.0 * fans / capacity * 100;

        System.out.printf("%.2f%%\n", percentA);
        System.out.printf("%.2f%%\n", percentB);
        System.out.printf("%.2f%%\n", percentV);
        System.out.printf("%.2f%%\n", percentG);
        System.out.printf("%.2f%%", percentStadium);
    }
}
