package ProgrammingBasicsOnlineExam;

import java.util.Scanner;

public class FoodForPets04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        double food = Double.parseDouble(scanner.nextLine());

        double dogAll = 0;
        double catAll = 0;
        double biscuits = 0;


        for (int i = 1; i <= days ; i++) {
            int foodDog = Integer.parseInt(scanner.nextLine());
            dogAll += foodDog;
            int foodCat = Integer.parseInt(scanner.nextLine());
            catAll += foodCat;
            if (i % 3 == 0) {
                biscuits += Math.round(foodCat + foodDog) * 0.10;
            }
        }
        double allFood = catAll + dogAll;
        double foodPercent = allFood / food * 100;
        double dogPercent = dogAll / allFood * 100;
        double catPercent = catAll / allFood * 100;

        System.out.printf("Total eaten biscuits: %.0fgr.\n", biscuits );
        System.out.printf("%.2f%% of the food has been eaten.\n", foodPercent);
        System.out.printf("%.2f%% eaten from the dog.\n", dogPercent);
        System.out.printf("%.2f%% eaten from the cat.", catPercent);

    }
}
