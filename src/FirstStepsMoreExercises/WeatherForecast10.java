package FirstStepsMoreExercises;

import java.util.Scanner;

public class WeatherForecast10 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double temp = Double.parseDouble(scan.nextLine());

        if (temp >= 26.00 && temp <= 35 ) {
            System.out.println("Hot");

            } else if (temp >= 20.1 && temp <= 25.9) {
                System.out.println("Warm");

            } else if (temp >= 15.00 && temp <= 20.00) {
                System.out.println("Mild");

            } else if (temp >= 12.00 && temp <= 14.9) {
                System.out.println("Cool");

            } else if (temp >= 5.00 && temp <= 11.9) {
                System.out.println("Cold");

            } else {
                System.out.println("unknown");
            }
        }
    }