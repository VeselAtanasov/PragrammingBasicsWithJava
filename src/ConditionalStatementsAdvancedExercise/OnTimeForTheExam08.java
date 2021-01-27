package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class OnTimeForTheExam08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int examHour = Integer.parseInt(scanner.nextLine());
        int examMinute  = Integer.parseInt(scanner.nextLine());
        int arriveHour = Integer.parseInt(scanner.nextLine());
        int arriveMinute = Integer.parseInt(scanner.nextLine());

        // превръщаме всичко в минути

        int examTime = examHour * 60 + examMinute;
        int arrivedTime = arriveHour * 60 + arriveMinute;



    }
}
