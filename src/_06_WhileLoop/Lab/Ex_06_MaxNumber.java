package _06_WhileLoop.Lab;

import java.util.Scanner;

public class Ex_06_MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        int max = Integer.MIN_VALUE;

        while (!command.equals("Stop")){
            int n = Integer.parseInt(command);
            if (n > max){
                max = n;
            }
            command = scanner.nextLine();
        }
        System.out.println(max);
    }
}
