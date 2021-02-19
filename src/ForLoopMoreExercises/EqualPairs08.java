package ForLoopMoreExercises;

import java.util.Scanner;

public class EqualPairs08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pairs = Integer.parseInt(scanner.nextLine());
        int currentSum;
        int previousSum = 0;
        int difference = 0;

        for (int i = 1; i <= pairs; i++) {

            if (i == 1){
                int firstNum = Integer.parseInt(scanner.nextLine());
                int secondNum = Integer.parseInt(scanner.nextLine());
                previousSum = firstNum + secondNum;
            } else {
                int firstNum2 = Integer.parseInt(scanner.nextLine());
                int secondNum2 = Integer.parseInt(scanner.nextLine());
                currentSum = firstNum2 + secondNum2;

                if (Math.abs(currentSum - previousSum ) > difference){
                    difference = Math.abs(currentSum - previousSum);
                }
                previousSum = currentSum;
            }
        }
        if (difference > 0){
            System.out.printf("No, maxdiff=%d", difference);
        } else {
            System.out.printf("Yes, value=%d", previousSum);
        }
    }
}
