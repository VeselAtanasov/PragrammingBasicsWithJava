package _05_NestedLoops.MoreExercises;

import java.util.Scanner;

public class Ex_02_LettersCombinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char first = scanner.next().charAt(0);
        char second = scanner.next().charAt(0);
        char ignore = scanner.next().charAt(0);

        int counter = 0;

        for (int i = first; i <= second ; i++) {
            for (int j = first; j <= second ; j++) {
                for (int k = first; k <= second ; k++) {
                    if (i != ignore && j != ignore && k != ignore){
                        counter ++;
                        System.out.printf("%c%c%c ", i, j, k);
                    }
                }
            }
        }
        System.out.printf("%d" , counter);
    }
}
