package NestedLoopsMoreExercises;

import java.util.Scanner;

public class TrainTheTrainers04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int jury = Integer.parseInt(scanner.nextLine());
        double score = 0;
        double count = 0;

        while (true) {
            String name = scanner.nextLine();
            double sumGrades = 0;

            if (name.equals("Finish")) {
                double scoreSum = score / count;
                System.out.printf("Student's final assessment is %.2f.", scoreSum);
                break;
            }
            for (int i = 0; i < jury; i++) {
                double grade = Double.parseDouble(scanner.nextLine());
                sumGrades += grade;
                score += grade;
                count++;
            }
            double total = sumGrades / jury;
            System.out.printf("%s - %.2f.\n", name, total);
        }
    }
}
