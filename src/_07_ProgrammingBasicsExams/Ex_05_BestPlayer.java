package _07_ProgrammingBasicsExams;

import java.util.Scanner;

public class Ex_05_BestPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int goalsMax = 0;
        String best = "";

        while (!name.equals("END")) {
            int goals = Integer.parseInt(scanner.nextLine());
            if (goals > goalsMax) {
                best = name;
                goalsMax = goals;
            }
            if (goals >= 10) {
                break;
            }
            name = scanner.nextLine();
        }
        System.out.printf("%s is the best player!%n", best);

        if (goalsMax < 3) {
            System.out.printf("He has scored %d goals.", goalsMax);
        } else {
            System.out.printf("He has scored %d goals and made a hat-trick !!!", goalsMax);
        }
    }
}