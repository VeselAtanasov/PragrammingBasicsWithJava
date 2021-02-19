package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class OperationsBetweenNumbers06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1  = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();

        int n = 0;

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
                    n = n1 / n2;
                    double newN = n;
                    double newN1 = n1;
                    double newN2 = n2;
                    newN = newN1 / newN2;
                    System.out.printf("%.0f / %.0f = %.2f", newN1, newN2, newN);
                } break;

            case "%":
                if(n1 == 0){
                    System.out.printf("Cannot divide %d by zero", n2);
                } else if(n2 == 0){
                    System.out.printf("Cannot divide %d by zero", n1);
                } else {
                    n = n1 % n2;
                    double newN = n;
                    double newN1 = n1;
                    double newN2 = n2;
                    newN = newN1 % newN2;
                    System.out.printf("%.0f %% %.0f = %.0f", newN1, newN2, newN);
                } break;
        }
    }
}

