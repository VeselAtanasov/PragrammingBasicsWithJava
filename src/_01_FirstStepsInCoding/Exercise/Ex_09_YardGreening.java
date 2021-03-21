package _01_FirstStepsInCoding.Exercise;

import java.util.Scanner;

public class Ex_09_YardGreening {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double area = Double.parseDouble(scanner.nextLine());
        double pricePerSquareMeter = 7.61;
        double price = area * pricePerSquareMeter;
        double discount = price * 0.18;
        double totalPrice = price - discount;

        System.out.printf("The final price is: %.2f lv.\n", totalPrice);
        System.out.printf("The discount is: %.2f lv.",discount);

    }
}
