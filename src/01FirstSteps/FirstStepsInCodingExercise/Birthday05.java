package FirstStepsInCodingExercise;

import java.util.Scanner;

public class Birthday05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int rentHall = Integer.parseInt(scanner.nextLine());

        double cakePrice = rentHall * 0.20;
        double drinks = cakePrice - (cakePrice * 0.45);
        double animator = rentHall / 3.0;
        double budget = cakePrice + drinks + animator + rentHall;


        System.out.println(budget);


    }
}
