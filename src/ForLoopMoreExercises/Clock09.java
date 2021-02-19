package ForLoopMoreExercises;

import java.util.Scanner;

public class Clock09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int hour = 0; hour <= 23; hour++) {

            for (int minutes = 0; minutes <= 59; minutes++) {

                for (int seconds = 0; seconds <= 59; seconds++) {

                    System.out.printf("%d : %d : %d\n", hour, minutes, seconds);

                }
            }
        }
    }
}

