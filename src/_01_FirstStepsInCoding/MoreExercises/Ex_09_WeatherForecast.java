package _01_FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class Ex_09_WeatherForecast {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String sunny = String.valueOf(scan.nextLine());

        if (sunny.equals("sunny")){
            System.out.println("It's warm outside!");
        } else {
            System.out.println("It's cold outside!");
        }
    }
}
