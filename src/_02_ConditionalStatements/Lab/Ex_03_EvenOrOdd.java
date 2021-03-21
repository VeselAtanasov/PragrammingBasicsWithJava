package _02_ConditionalStatements.Lab;

import java.util.Scanner;

public class Ex_03_EvenOrOdd {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());

        if (number % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}
