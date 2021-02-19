package ForLoopLab;

import java.util.Scanner;

public class OddEvenSum10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int odd = 0;
        int even = 0;

        for (int i = 0; i < n; i++) {
            int element = Integer.parseInt(scanner.nextLine());
            if (i % 2 != 0) {
                odd += element;
            } else {
                even += element;
            }

        }
        if (even == odd) {
            System.out.println("Yes\nSum = " + even);
        } else {
            System.out.println("No\nDiff = " + Math.abs(even - odd));
        }
    }
}


