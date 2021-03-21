package _02_ConditionalStatements.Exercise;

import java.util.Scanner;

public class Ex_07_WorldSwimmingRecord {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double recordInSec = Double.parseDouble(scan.nextLine());
        double distance = Double.parseDouble(scan.nextLine());
        double timePerMeter = Double.parseDouble(scan.nextLine());

        // 15 м. с 12.5 секунди. Когато се изчислява колко пъти Иван ще се забави, в резултат на
        // съпротивлението на водата, резултатът трябва да се закръгли надолу до най-близкото цяло число.

        double timeAndDistance = (distance * timePerMeter);
        double looses = Math.floor(distance / 15) * 12.5;
        double totalTime = (timeAndDistance + looses);


        if (recordInSec <= totalTime) {
            System.out.printf("No, he failed! He was %.2f seconds slower.", (totalTime - recordInSec));
        } else {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalTime);
        }
    }
}

