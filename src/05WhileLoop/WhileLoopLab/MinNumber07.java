package WhileLoopLab;

import java.util.Scanner;

public class MinNumber07 {
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