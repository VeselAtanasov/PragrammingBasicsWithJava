package ProgrammingBasicsOnlineExam;

import java.util.Scanner;

public class EasterShop04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantityEggs = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        int leftEggs = quantityEggs; // Първоначално оставащите яйца са равни quantityEggs(По принцип, тази променлива е излишна. Може да използваш quantityEggs)
        int soldEggs = 0;

        while (!command.equals("Close")) {

            int countEggs = Integer.parseInt(scanner.nextLine());

            if (command.equals("Buy")) {
                if (countEggs <= leftEggs) { // Преди да продадем яйжата пъво трябва да проверим дали имаме достатъчно.
                    leftEggs = leftEggs - countEggs;//или leftEggs -= countEggs;
                    soldEggs += countEggs;
                } else {
                    System.out.println("Not enough eggs in store!");
                    System.out.printf("You can buy only %d.", leftEggs);
                    break;
                }

            } else if (command.equals("Fill")) {
                leftEggs = leftEggs + countEggs; // или leftEggs += countEggs;
            }
            command = scanner.nextLine();// Четем следващата команда
        }

        if (command.equals("Close")) {
            System.out.println("Store is closed!");
            System.out.printf("%d eggs sold.", soldEggs);
        }
    }
}