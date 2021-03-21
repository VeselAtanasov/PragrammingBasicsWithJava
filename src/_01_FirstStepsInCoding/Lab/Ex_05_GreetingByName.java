package _01_FirstStepsInCoding.Lab;

import java.util.Scanner;

public class Ex_05_GreetingByName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.print("Hello, " + name + "!");
    }
}
