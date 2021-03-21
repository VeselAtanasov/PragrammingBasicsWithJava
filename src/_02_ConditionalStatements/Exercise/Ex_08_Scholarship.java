package _02_ConditionalStatements.Exercise;

import java.util.Scanner;

public class Ex_08_Scholarship {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double income = Double.parseDouble(scan.nextLine());
        double avgScore = Double.parseDouble(scan.nextLine());
        double minSalary = Double.parseDouble(scan.nextLine());
        // Проверка за социална стипендия
        double socialScholarship = 0;
        double excellentScholarship = 0;
        String output = "";

        if (avgScore > 4.50) {
            if (income < minSalary) {
                socialScholarship = Math.floor(minSalary * 0.35);
            }
        }   // Проверка за отлична стипендия
        if (avgScore >= 5.50){
            excellentScholarship = Math.floor(avgScore * 25);
        }
        // Проверка дали изобщо може да получи някаква стипендия
        if (socialScholarship == 0 && excellentScholarship == 0) {
            output = "You cannot get a scholarship!";
            // Проверка коя стипендия е по-висока
        }else if (socialScholarship > excellentScholarship){
            output = String.format("You get a Social scholarship %.0f BGN", socialScholarship);
        }else if (socialScholarship <= excellentScholarship){
            output = String.format("You get a scholarship for excellent results %.0f BGN", excellentScholarship);
        }
        // Принт
        System.out.println(output);
    }
}
