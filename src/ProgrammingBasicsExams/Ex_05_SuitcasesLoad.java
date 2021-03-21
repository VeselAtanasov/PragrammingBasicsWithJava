package ProgrammingBasicsExams;

import java.util.Scanner;

public class Ex_05_SuitcasesLoad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double plainVolume = Double.parseDouble(scanner.nextLine());
        String volume = scanner.nextLine();
        int count = 0;
        int count2 = 0;
        boolean space = false;

        while (!"End".equals(volume)) {
            double volumeCase = Double.parseDouble(volume);
            count2++;
            if (count2 % 3 == 0) {
                volumeCase *= 1.1;
            }
            if (plainVolume >= volumeCase) {
                plainVolume -= volumeCase;
                count++;
            } else {
                space = true;
                break;
            }
            volume = scanner.nextLine();
        }
        if (space) {
            System.out.println("No more space!");
        } else {
            System.out.println("Congratulations! All suitcases are loaded!");
        }
        System.out.printf("Statistic: %d suitcases loaded.", count);
    }
}