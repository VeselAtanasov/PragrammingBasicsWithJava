package _01_FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class Ex_03_CelsiusToFahrenheit {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //° F = (° C × 9/5) + 32

        double celsius = Double.parseDouble(scan.nextLine());
        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.printf("%.2f",fahrenheit);

    }
}
