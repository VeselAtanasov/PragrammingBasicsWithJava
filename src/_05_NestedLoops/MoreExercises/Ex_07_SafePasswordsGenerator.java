package _05_NestedLoops.MoreExercises;

import java.util.Scanner;

public class Ex_07_SafePasswordsGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int maxCount = Integer.parseInt(scanner.nextLine());

        boolean flag = false;
        int counter = 0;

        char A = 35;
        char B = 64;

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                counter++;

                if (A > 55) {
                    A = 35;
                }
                if (B > 96) {
                    B = 64;
                }
                    if (counter > maxCount) {
                        flag = true;
                        break;
                    }
                    System.out.printf("%c%c%d%d%c%c|", A, B, i, j, A, B);
                    A++;
                    B++;

                }
                if (flag) {
                    break;
                }
            }
        }
    }