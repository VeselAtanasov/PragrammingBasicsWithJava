package WhileLoopMoreExercises;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Dishwasher01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bottles = parseInt(scanner.nextLine());
        String dishes;

        int detergent = bottles * 750;
        int plate = 5;
        int pot = 15;
        int platesClean = 0;
        int potsClean = 0;
        int counter = 0;

        while (detergent >= 0) {
            dishes = scanner.nextLine();
            if (dishes.equals("End")) {
                break;
            }
            counter++;
            if (counter % 3 == 0) {
                detergent -= (parseInt(dishes) * pot);
                potsClean += parseInt(dishes);
            } else {
                detergent -= (parseInt(dishes) * plate);
                platesClean += parseInt(dishes);
            }
        }
        if (detergent >= 0) {
            System.out.printf("Detergent was enough!%n%d dishes and %d pots were washed.%nLeftover detergent %d ml.", platesClean, potsClean, detergent);
        } else {
            System.out.printf("Not enough detergent, %d ml. more necessary!", Math.abs(detergent));
        }
    }
}