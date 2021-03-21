package _05_NestedLoops.Exercises;

import java.util.Scanner;

public class Ex_01_NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int number = 0;
        boolean isEqual = false;
        for (int row = 1; row <= n; row++) {
            for (int coll = 1; coll <= row; coll++) {
                number++;
                if (number > n){
                    isEqual = true;
                    break;
                }
                System.out.print(number + " ");
            }
            if (isEqual){
                break;
            }
            System.out.println();
        }
    }
}
