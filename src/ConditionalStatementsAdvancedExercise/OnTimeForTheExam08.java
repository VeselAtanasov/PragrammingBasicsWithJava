package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class OnTimeForTheExam08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int examHour = Integer.parseInt(scanner.nextLine());
        int examMinute = Integer.parseInt(scanner.nextLine());
        int arriveHour = Integer.parseInt(scanner.nextLine());
        int arriveMinute = Integer.parseInt(scanner.nextLine());

        // превръщаме всичко в минути

        int examTime = examHour * 60 + examMinute;
        int arrivedTime = arriveHour * 60 + arriveMinute;
        String output = "";
        String output2 = "";
        int difference = 0;

        if (arrivedTime < examTime - 30) {
            output = "Early";
            difference = examTime - arrivedTime;

            if (difference < 60) {
                output2 = String.format("%d minutes before the start", difference);
            } else {
                int hour = difference / 60;
                int minutes = difference % 60;
                output2 = String.format("%d:%02d hours before the start",hour, minutes);
            }
        } else if (arrivedTime <= examTime) {
            output = "On time";
            difference = examTime - arrivedTime;
            output2 = String.format("%d minutes before the start", difference);

        } else {

            output = "Late";
            difference = arrivedTime - examTime;
            if (difference < 60) {
                output2 = String.format("%d minutes after the start", difference);
            } else {
                int hour = difference / 60;
                int minutes = difference % 60;
                output2 = String.format("%d:%02d hours after the start",hour, minutes);
            }
        }

        System.out.println(output);
        System.out.println(output2);
    }
}


