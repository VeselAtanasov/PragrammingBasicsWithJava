package _02_ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class Ex_02_SleepyTom {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //•	Когато е на работа, стопанинът му си играе с него по 63 минути на ден.
        //•	Когато почива, стопанинът му си играе с него  по 127 минути на ден.

        //int hours = t / 60; //since both are ints, you get an int
        //int minutes = t % 60;
        //System.out.printf("%d:%02d", hours, minutes);

        int freeDays = Integer.parseInt(scan.nextLine());
        int minutesGameInFreeTime = 127;
        int minutesGameInWorkingTime = 63;
        int normalGameForYear = 30000;
        int minutesPerDay = freeDays * minutesGameInFreeTime;
        int workingDays = 365 - freeDays;
        int totalMinutesGame = (workingDays * minutesGameInWorkingTime + minutesPerDay);
        double sumTotalMinutes = Math.abs(normalGameForYear - totalMinutesGame);
        double hours = Math.floor(sumTotalMinutes / 60);
        double minutes = Math.abs(sumTotalMinutes % 60);

        if (normalGameForYear >= totalMinutesGame) {
            System.out.printf("Tom sleeps well\n%.0f hours and %.0f minutes less for play", hours, minutes);
        } else {
            System.out.printf("Tom will run away\n%.0f hours and %.0f minutes more for play", hours, minutes);
        }
    }
}

