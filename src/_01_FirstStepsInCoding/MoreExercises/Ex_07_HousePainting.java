package _01_FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class Ex_07_HousePainting {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        double x = Double.parseDouble(scan.nextLine());
        double y = Double.parseDouble(scan.nextLine());
        double h = Double.parseDouble(scan.nextLine());

        double redPaint = 4.3;
        double greenPaint = 3.4;

        double door = 1.2 * 2;
        double window = 1.5 * 1.5;


        double greenFrontAndBack = ((x * x) * 2) - (door);
        double greenSides = ((x * y) * 2) - (window * 2);
        double redRoof = ((x * y) * 2) + ((x * h) / 2) * 2;

        double allGreen = ( greenFrontAndBack + greenSides ) / greenPaint;
        double allRed = redRoof / redPaint;


        System.out.printf("%.2f\n",allGreen);
        System.out.printf("%.2f",allRed);


    }
}
