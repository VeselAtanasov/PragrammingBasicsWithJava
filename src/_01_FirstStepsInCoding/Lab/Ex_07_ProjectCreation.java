package _01_FirstStepsInCoding.Lab;

import java.util.Scanner;

public class Ex_07_ProjectCreation {
    public static void main(String[] args) {
        // Architect Name ?
        // Projects Numbers / 0-100 /
        // Needed time for 1 Project - 3 hours

        Scanner scanner = new Scanner(System.in);

        String architectName = scanner.nextLine();
        int projectNumber = Integer.parseInt(scanner.nextLine());

        System.out.printf("The architect %s will need %d hours to complete %d project/s.", architectName, projectNumber * 3, projectNumber);

    }
}