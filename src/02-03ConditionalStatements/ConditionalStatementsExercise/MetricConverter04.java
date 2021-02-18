package ConditionalStatementsExercise;

import java.util.Scanner;

public class MetricConverter04 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        // m cm mm
        double dimension = Double.parseDouble(scan.nextLine());
        String input = scan.nextLine();
        String output = scan.nextLine();

         // Превръщаме Input в статична мерна единица (базова) - метри

        if (input.equals("cm")) {
            dimension = dimension / 100;
        } else if (input.equals("mm")) {
            dimension = dimension / 1000;
        }
          // Инпут винаги ще е в метри
          // Преогразуване в оутпут
        if (output.equals("cm")){
            dimension = dimension * 100;
        }else if (output.equals("mm")){
            dimension = dimension * 1000;
        }
        System.out.printf("%.3f", dimension);
    }
}
