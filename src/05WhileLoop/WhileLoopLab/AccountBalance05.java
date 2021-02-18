package WhileLoopLab;

import java.util.Scanner;

public class AccountBalance05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();
        double balance = 0.0;

        while (!input.equals("NoMoreMoney")){
            double sum = Double.parseDouble(input);
            if (sum >= 0){
                balance += sum;
                System.out.printf("Increase: %.2f\n",sum);
                input = scanner.nextLine();
            } else {
                System.out.println("Invalid operation!");
                break;
            }
        }
        System.out.printf("Total: %.2f",balance);
    }
}
