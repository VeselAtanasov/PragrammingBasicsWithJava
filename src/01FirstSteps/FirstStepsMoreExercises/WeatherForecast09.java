package FirstStepsMoreExercises;

import java.util.Scanner;

public class WeatherForecast09 {
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
