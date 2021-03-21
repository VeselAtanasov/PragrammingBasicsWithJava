package _04_ForLoop.Lab;

import java.util.Scanner;

public class Ex_02_NumbersN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (; n >= 1 ; n--) {
            System.out.println(n);
        }
    }
}
