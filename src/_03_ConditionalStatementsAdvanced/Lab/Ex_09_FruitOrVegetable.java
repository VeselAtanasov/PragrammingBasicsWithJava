package _03_ConditionalStatementsAdvanced.Lab;

import java.util.Scanner;

public class Ex_09_FruitOrVegetable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruitOrVegetable = scanner.nextLine();

        switch (fruitOrVegetable) {
            case "banana":
            case "apple":
            case "kiwi":
            case "cherry":
            case "lemon":
            case "grapes":
                System.out.println("fruit");
                break;
            case "tomato":
            case "cucumber":
            case "pepper":
            case "carrot":
                System.out.println("vegetable");
                break;
            default:
                System.out.println("unknown");
        }
    }
}
