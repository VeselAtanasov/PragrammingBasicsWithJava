package _02_ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class Ex_05_Firm {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int hoursForProject = Integer.parseInt(scan.nextLine());
        int daysForProject = Integer.parseInt(scan.nextLine());
        int workers = Integer.parseInt(scan.nextLine());

        double workingHours = daysForProject * 8;
        double education = workingHours * 0.10;
        double totalHours = workingHours - education;
        double extraLabor = (daysForProject * 2) * workers;

        double hoursSum = Math.floor(totalHours + extraLabor);
        double hoursX = Math.abs(hoursSum - hoursForProject);

        if (hoursSum >= hoursForProject) {
            System.out.printf("Yes!%.0f hours left.", hoursX);
        }
        else if (hoursSum < hoursForProject){
            System.out.printf("Not enough time!%.0f hours needed.", hoursX);
        }
    }
}