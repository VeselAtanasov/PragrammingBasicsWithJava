package ConditionalStatementsAdvancedLab;

import java.util.Scanner;

public class NumberInRange06 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());

        if (num >= -100 && num <= 100 && num !=0){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}