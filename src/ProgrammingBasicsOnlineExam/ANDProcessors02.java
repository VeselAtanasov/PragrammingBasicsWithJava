package ProgrammingBasicsOnlineExam;

import java.util.Scanner;

public class ANDProcessors02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int processors = Integer.parseInt(scanner.nextLine());
        int staff = Integer.parseInt(scanner.nextLine());
        int workingDays = Integer.parseInt(scanner.nextLine());

        double hours = staff * workingDays * 8;
        double allProcessors = Math.floor(hours / 3);

        double losses = (processors - allProcessors);
        double totalSum = Math.abs(losses * 110.10);

        if (allProcessors < processors) {
            System.out.printf("Losses: -> %.2f BGN", totalSum);
        } else {
            System.out.printf("Profit: -> %.2f BGN", totalSum);
        }
    }
}
