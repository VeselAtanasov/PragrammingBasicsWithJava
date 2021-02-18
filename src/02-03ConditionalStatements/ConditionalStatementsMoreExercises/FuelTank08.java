package ConditionalStatementsMoreExercises;

import java.util.Scanner;

public class FuelTank08 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String fuel = scanner.nextLine().toLowerCase();

            double availableFuel = Double.parseDouble(scanner.nextLine());
            boolean isValid = fuel.equals("diesel") || fuel.equals("gasoline") || fuel.equals("gas");

            if (isValid && availableFuel >= 25) {
                System.out.printf("You have enough %s.", fuel);
            } else if (isValid && availableFuel < 25) {
                System.out.printf("Fill your tank with %s!", fuel);
            } if (!isValid) {
                System.out.println("Invalid fuel!");
            }
        }
    }

