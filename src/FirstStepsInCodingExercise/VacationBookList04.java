package FirstStepsInCodingExercise;

import java.util.Scanner;

public class VacationBookList04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Прочитане на вход
        int allSheets = Integer.parseInt(scanner.nextLine());
        int sheetsPerHour = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());

        // Изчисления

        int totalTime = allSheets / sheetsPerHour;
        int neededHours = totalTime / days;

        // Принтиране

        System.out.println(neededHours);
    }
}
