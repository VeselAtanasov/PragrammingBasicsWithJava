package FirstStepsInCodingExercise;

import java.util.Scanner;

public class FishTank08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        double volumeInCm = length * height * width;
        double volumeInLitres = volumeInCm * 0.001;
        double percentCm = percent * 0.01;
        double neededLitres = volumeInLitres - volumeInLitres * percentCm;

        System.out.printf("%.2f", neededLitres);

    }
}
