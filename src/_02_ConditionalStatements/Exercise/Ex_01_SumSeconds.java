package _02_ConditionalStatements.Exercise;

import java.util.Scanner;

public class Ex_01_SumSeconds {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int first = Integer.parseInt(scan.nextLine());
        int second = Integer.parseInt(scan.nextLine());
        int third = Integer.parseInt(scan.nextLine());

        int totalTimeInSec = first + second + third;
        int min = totalTimeInSec / 60;
        int sec = totalTimeInSec % 60;

        if (sec < 10){
            System.out.printf("%d:0%d", min,sec);
        } else {
            System.out.printf("%d:%d", min,sec);
        }
        // System.out.printf("%d:%02d", min, sec);
    }
}

