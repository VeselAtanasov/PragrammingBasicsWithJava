package WhileLoopExercise;

import java.util.Scanner;

public class Vacation03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tripMoney = Double.parseDouble(scanner.nextLine());
        double currentMoney = Double.parseDouble(scanner.nextLine());
        int countSpend = 0;
        int counter = 0;

        while (currentMoney < tripMoney) {
            counter++;
            String command = scanner.nextLine();
            double amount = Double.parseDouble(scanner.nextLine());

            if (command.equals("save")) {
                currentMoney += amount;
                countSpend = 0;
            } else if (command.equals("spend")) {

                currentMoney -= amount;
                if (currentMoney < 0) {
                    currentMoney = 0;
                }
                countSpend++;
            }
            if (countSpend == 5) {
                System.out.printf("You can't save the money.%n%d", counter);
                break;
            }
            if (currentMoney >= tripMoney) {
                System.out.printf("You saved the money for %d days.", counter);
            }
        }
    }
}