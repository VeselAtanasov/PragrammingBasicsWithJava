package _06_WhileLoop.Lab;

import java.util.Scanner;

public class Ex_07_MinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        int min = Integer.MAX_VALUE;

        while (!command.equals("Stop")){
            int n = Integer.parseInt(command);
            if (n < min){
                min = n;
            }
            command = scanner.nextLine();
        }
        System.out.println(min);
    }
}