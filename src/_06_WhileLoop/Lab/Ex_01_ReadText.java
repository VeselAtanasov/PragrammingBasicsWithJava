package _06_WhileLoop.Lab;

import java.util.Scanner;

public class Ex_01_ReadText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        while (!input.equals("Stop")){
            System.out.println(input);
            input = scanner.nextLine();
        }
    }
}
