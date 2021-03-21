package _02_ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class Ex_01_PipesInPool {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int v = Integer.parseInt(scan.nextLine()); // обем в литри
        int p1 = Integer.parseInt(scan.nextLine()); // дебит 1 тръба
        int p2 = Integer.parseInt(scan.nextLine());  // дебит 2 тръба
        double hours = Double.parseDouble(scan.nextLine());  // часове отсъствие

        double litresPerHourPipe1 = p1 * hours;                                //300
        double litresPerHourPipe2 = p2 * hours;                                // 360
        double totalLitres = litresPerHourPipe1 + litresPerHourPipe2;         // 1000

        double workPipe1 = (litresPerHourPipe1 / v) * 100;
        double workPipe2 = (litresPerHourPipe2 / v) * 100;
        double litresInPercent = workPipe1 + workPipe2;
        double percentPipe1 = workPipe1 / litresInPercent * 100;
        double percentPipe2 = workPipe2 / litresInPercent * 100;

        double overFlow = totalLitres - v;

        if (v >= totalLitres) {
            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.", litresInPercent, percentPipe1, percentPipe2);
        }
        else if (v < totalLitres) {
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", hours, overFlow);
        }
    }
}
