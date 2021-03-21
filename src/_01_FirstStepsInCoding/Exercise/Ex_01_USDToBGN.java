package _01_FirstStepsInCoding.Exercise;

import java.util.Scanner;

public class Ex_01_USDToBGN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double usd = Double.parseDouble(scanner.nextLine());
        double rate = 1.79549;
        double bgn = usd * rate;

        System.out.println(bgn);

    }
}
