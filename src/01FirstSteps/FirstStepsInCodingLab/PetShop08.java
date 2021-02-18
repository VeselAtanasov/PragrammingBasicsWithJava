package FirstStepsInCodingLab;

import java.util.Scanner;

public class PetShop08 {
    public static void main(String[] args) {

        // 1 food package for dog - 2.50 lv.
        // 1 food package for other animal - 4 lv.
        // Numbers of dogs / 0 - 100 /
        // Numbers of others animals / 0 - 100 /
        // End - Total Price

        Scanner scanner = new Scanner(System.in);

        double dogs = Double.parseDouble(scanner.nextLine());
        double other = Double.parseDouble(scanner.nextLine());
        double dogprice = dogs * 2.50;
        double otherprice = other * 4;
        double total = dogprice + otherprice;
        System.out.println( total + " lv." );

    }
}
