package ConditionalStatementsAdvancedLab;

import java.util.Scanner;

public class InvalidNumber10 {
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
