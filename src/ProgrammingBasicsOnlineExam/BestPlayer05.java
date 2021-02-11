package ProgrammingBasicsOnlineExam;

import java.util.Scanner;

public class BestPlayer05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int goals = 0;
        int goalsMax = 0;
        String best = "";

        while (!name.equals("END")) {
            goals = Integer.parseInt(scanner.nextLine());
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

        if (goals >= 3) {
            System.out.printf("He has scored %d goals and made a hat-trick !!!", goals);
        } else {
            System.out.printf("He has scored %d goals.", goals);
        }
    }
}

