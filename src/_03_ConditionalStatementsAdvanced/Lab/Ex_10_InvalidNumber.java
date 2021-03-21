package _03_ConditionalStatementsAdvanced.Lab;

import java.util.Scanner;

public class Ex_10_InvalidNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        if (num == 0){
            System.out.println();
        } else if (num > 200){
            System.out.println("invalid");
        } else if (num < 100){
            System.out.println("invalid");
        } else {
            System.out.println();
        }
    }
}
