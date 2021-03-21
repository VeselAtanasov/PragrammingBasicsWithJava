package _06_WhileLoop.Lab;

import java.util.Scanner;

public class Ex_08_Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String studentName = scanner.nextLine();
        double sum = 0;
        int count = 0;
        boolean graduated = true;

        while (count < 12) {
            double grade = Double.parseDouble(scanner.nextLine());
            if (grade >= 4) {
                sum = sum + grade;
                count++;
            } else {
                graduated = false;
                break;
            }
        }
        if (graduated) {
            System.out.printf("%s graduated. Average grade: %.2f", studentName, sum / 12);
        } else {
            System.out.printf("%s has been excluded at %d grade", studentName, ++count);
        }
    }
}
