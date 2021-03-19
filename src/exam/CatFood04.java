package exam;

import java.util.Scanner;

public class CatFood04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cats = Integer.parseInt(scanner.nextLine());

        int smallCats = 0;
        int bigCats = 0;
        int extraBigCats = 0;
        double sumFood = 0;

        for (int i = 1; i <= cats; i++) {
            double food = Double.parseDouble(scanner.nextLine());
            sumFood += food;
            if (food >= 100 && food < 200) {
                smallCats++;
            } else if (food >= 200 && food < 300) {
                bigCats++;
            } else if (food >= 300 && food < 400) {
                extraBigCats++;
            }
        }
        double money = sumFood / 1000 * 12.45;
        System.out.printf("Group 1: %d cats.\n", smallCats);
        System.out.printf("Group 2: %d cats.\n", bigCats);
        System.out.printf("Group 3: %d cats.\n", extraBigCats);
        System.out.printf("Price for food per day: %.2f lv.", money);
    }
}