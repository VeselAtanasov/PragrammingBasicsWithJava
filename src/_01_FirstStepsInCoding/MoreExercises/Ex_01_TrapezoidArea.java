package _01_FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class Ex_01_TrapezoidArea {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double b1 = Double.parseDouble(scan.nextLine());
        double b2 = Double.parseDouble(scan.nextLine());
        double h = Double.parseDouble(scan.nextLine());

        double trapezoid = ((b1+b2) * h ) / 2;

        System.out.printf("%.2f", trapezoid);

    }

}
