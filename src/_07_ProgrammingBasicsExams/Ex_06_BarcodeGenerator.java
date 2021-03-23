package _07_ProgrammingBasicsExams;

import java.util.Scanner;

public class Ex_06_BarcodeGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());

        int AA = start / 1000;
        int BA = (start / 100) % 10;
        int CA = (start / 10) % 10;
        int DA = start % 10;

        int AB = end / 1000;
        int BB = (end / 100) % 10;
        int CB = (end / 10) % 10;
        int DB = end % 10;

        for (int i = AA; i <= AB; i++) {
            for (int j = BA; j <= BB; j++) {
                for (int k = CA; k <= CB; k++) {
                    for (int l = DA; l <= DB; l++) {
                        if (i % 2 != 0 && j % 2 != 0 && k % 2 != 0 && l % 2!= 0){
                            System.out.print("" + i + j + k + l + " ");
                        }
                    }
                }
            }
        }
    }
}
