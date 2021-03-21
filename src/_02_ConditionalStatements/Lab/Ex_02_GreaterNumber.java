package _02_ConditionalStatements.Lab;

import java.util.Scanner;

public class Ex_02_GreaterNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num1 = Integer.parseInt(scan.nextLine());
        int num2 = Integer.parseInt(scan.nextLine());

        System.out.println(Math.max(num1, num2));
    }
}
