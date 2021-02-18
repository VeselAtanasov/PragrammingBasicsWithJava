package ForLoopMoreExercises;

import java.util.Scanner;

public class Grades04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int students = Integer.parseInt(scanner.nextLine());
        double grade2 = 0;
        double grade3 = 0;
        double grade4 = 0;
        double grade5 = 0;
        double grades = 0;

        for (int i = 1; i <= students; i++) {
            double grade = Double.parseDouble(scanner.nextLine());
            grades += grade;

            if (grade >= 2.00 && grade <= 2.99) {
                grade2++;
            } else if (grade >= 3.00 && grade <= 3.99) {
                grade3++;
            } else if (grade >= 4.00 && grade <= 4.99) {
                grade4++;
            } else if (grade >= 5.00) {
                grade5++;
            }

        }
        double grade2Percent = grade2 / students * 100;
        double grade3Percent = grade3 / students * 100;
        double grade4Percent = grade4 / students * 100;
        double grade5Percent = grade5 / students * 100;
        double averageGrade = grades / students;

        System.out.printf("Top students: %.2f%%\n", grade5Percent);
        System.out.printf("Between 4.00 and 4.99: %.2f%%\n", grade4Percent);
        System.out.printf("Between 3.00 and 3.99: %.2f%%\n", grade3Percent);
        System.out.printf("Fail: %.2f%%\n", grade2Percent);
        System.out.printf("Average: %.2f", averageGrade);
    }
}

