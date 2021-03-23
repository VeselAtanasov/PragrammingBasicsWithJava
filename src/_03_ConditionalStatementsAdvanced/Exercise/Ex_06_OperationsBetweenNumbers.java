package _03_ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class Ex_06_OperationsBetweenNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1  = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();

        int n;

        switch (operator) {
            case "+":
                n = n1 + n2;
                if(n % 2 == 0) {
                    System.out.printf("%d + %d = %d - even", n1, n2, n);
                } else {
                    System.out.printf("%d + %d = %d - odd", n1, n2, n);
                } break;


            case "-":
                n = n1 - n2;
                if(n % 2 == 0) {
                    System.out.printf("%d - %d = %d - even", n1, n2, n);
                } else {
                    System.out.printf("%d - %d = %d - odd", n1, n2, n);
                } break;


            case "*":
                n = n1 * n2;
                if(n % 2 == 0) {
                    System.out.printf("%d * %d = %d - even", n1, n2, n);
                } else {
                    System.out.printf("%d * %d = %d - odd", n1, n2, n);
                } break;

            case "/":
                if (n1 == 0) {
                    System.out.printf("Cannot divide %d by zero", n2);
                } else if (n2 == 0) {
                    System.out.printf("Cannot divide %d by zero", n1);
                } else {

                    double newN;
                    newN = (double) n1 / (double) n2;
                    System.out.printf("%.0f / %.0f = %.2f", (double) n1, (double) n2, newN);
                } break;

            case "%":
                if(n1 == 0){
                    System.out.printf("Cannot divide %d by zero", n2);
                } else if(n2 == 0){
                    System.out.printf("Cannot divide %d by zero", n1);
                } else {

                    double newN;
                    newN = (double) n1 % (double) n2;
                    System.out.printf("%.0f %% %.0f = %.0f", (double) n1, (double) n2, newN);
                } break;
        }
    }
}

