package _02_ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class Ex_06_Pets {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int food = Integer.parseInt(scanner.nextLine());
        double foodDogPerDay = Double.parseDouble(scanner.nextLine());
        double foodCatPerDay = Double.parseDouble(scanner.nextLine());
        double foodTurtlePerDay = Double.parseDouble(scanner.nextLine());

        double foodDog = days * foodDogPerDay;
        double foodCat = days * foodCatPerDay;
        double foodTurtle = (days * foodTurtlePerDay) / 1000;
        double foodNeeded = foodDog + foodCat + foodTurtle;

        double foodX = Math.abs(food - foodNeeded);

        if (food >= foodNeeded) {
            System.out.printf("%.0f kilos of food left.", Math.floor(foodX));
        } else if (food < foodNeeded){
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(foodX));
        }
    }
}