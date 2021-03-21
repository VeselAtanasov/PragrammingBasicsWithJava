package _01_FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class Ex_08_CircleAreaAndPerimeter {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double r = Double.parseDouble(scan.nextLine());

        double d = r * r;

        double calculatedParameter = Math.PI * r * 2;
        double calculatedArea = Math.PI * d;

        System.out.printf("%.2f\n",calculatedArea);
        System.out.printf("%.2f",calculatedParameter);

    }
}
