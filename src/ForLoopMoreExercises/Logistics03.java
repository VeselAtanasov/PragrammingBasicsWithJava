package ForLoopMoreExercises;

import java.util.Scanner;

public class Logistics03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int pack = Integer.parseInt(scanner.nextLine());
        double weightSum = 0;
        double weightPrice = 0;
        double weightBus = 0;
        double weightTruck = 0;
        double weightTrain = 0;


        for (int i = 1; i <= pack; i++) {
            double weight = Double.parseDouble(scanner.nextLine());
            weightSum += weight;
            if (weight <= 3) {
                weightBus += weight;
                weightPrice += (200 * weight);
            }
            if (weight >= 4 && weight <= 11) {
                weightTruck += weight;
                weightPrice += (175 * weight);

            }
            if (weight >= 12) {
                weightTrain += weight;
                weightPrice += (120 * weight);

            }
        }
        double totalSum = weightPrice / weightSum;
        System.out.printf("%.2f\n", totalSum);

        double percentBus = weightBus / weightSum * 100;
        double percentTruck = weightTruck / weightSum * 100;
        double percentTrain = weightTrain / weightSum * 100;

        System.out.printf("%.2f%%\n", percentBus);
        System.out.printf("%.2f%%\n", percentTruck);
        System.out.printf("%.2f%%", percentTrain);

    }
}
