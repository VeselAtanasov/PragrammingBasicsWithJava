package _03_ConditionalStatementsAdvanced.Lab;

import java.util.Scanner;

public class Ex_03_AnimalType {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //•	dog -> mammal
        //•	crocodile, tortoise, snake -> reptile
        //•	others -> unknown

        String animal = scan.nextLine();

        switch (animal){
            case "dog":
                System.out.println("mammal");
                break;
            case "crocodile":
            case "tortoise":
            case "snake":
                System.out.println("reptile");
                break;
            default:
                System.out.println("unknown");
                break;

        }
    }
}
