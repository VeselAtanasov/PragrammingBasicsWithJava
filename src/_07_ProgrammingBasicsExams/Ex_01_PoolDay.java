package _07_ProgrammingBasicsExams;

import java.util.Scanner;

public class Ex_01_PoolDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        double entranceFee = Double.parseDouble(scanner.nextLine());
        double chairPrice = Double.parseDouble(scanner.nextLine());
        double umbrellaPrice = Double.parseDouble(scanner.nextLine());

        double allFees = people * entranceFee;
        double allChairs = Math.ceil(people * 0.75) * chairPrice;
        double allUmbrellas = Math.ceil(people * 0.50) * umbrellaPrice;

        double totalSum = allFees + allChairs + allUmbrellas;

        System.out.printf("%.2f lv.", totalSum);
    }
}
