package _01_FirstStepsInCoding.Lab;

import java.util.Scanner;

public class Ex_03_SquareArea {
    public static void main(String[] args) {
        // Скенер
        Scanner scanner = new Scanner(System.in);
        // Четем страна на квадрат - "а"
        int a = Integer.parseInt(scanner.nextLine());
        // Изчислим лицето на квадрата а*а
        int area = a*a;
        // Принтираме изчисленото лице
        System.out.println(area);

    }
}
