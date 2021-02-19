package ForLoopLab;

import java.util.Scanner;

public class NumbersN02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (; n >= 1 ; n--) {
            System.out.println(n);
        }
    }
}
