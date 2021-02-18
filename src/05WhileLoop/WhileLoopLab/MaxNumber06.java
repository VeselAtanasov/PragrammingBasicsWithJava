package WhileLoopLab;

import java.util.Scanner;

public class MaxNumber06 {
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
