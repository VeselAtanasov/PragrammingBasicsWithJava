package _07_ProgrammingBasicsExams;

import java.util.Scanner;

public class Ex_04_TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groups = Integer.parseInt(scanner.nextLine());


        double musala = 0;
        double montBlanc = 0;
        double kim = 0;
        double k2 = 0;
        double everest = 0;
        double allPeople = 0;

        for (int i = 1; i <= groups; i++) {
            int count = Integer.parseInt(scanner.nextLine());
            allPeople += count;
            if (count <= 5) {
                musala += count;
            } else if (count <= 12) {
                montBlanc += count;
            }else if (count <= 25) {
                kim += count;
            }else if (count <= 40) {
                k2 += count;
            } else {
                everest += count;
            }
        }

        double musalaPercent = musala/allPeople * 100;
        double montBlancPercent = montBlanc/allPeople * 100;
        double kimPercent = kim/allPeople * 100;
        double k2Percent = k2/allPeople * 100;
        double everestPercent = everest/allPeople * 100;

        System.out.printf("%.2f%%\n", musalaPercent);
        System.out.printf("%.2f%%\n", montBlancPercent);
        System.out.printf("%.2f%%\n", kimPercent);
        System.out.printf("%.2f%%\n", k2Percent);
        System.out.printf("%.2f%%", everestPercent);

    }
}
