package ConditionalStatementsExercise;

import java.util.Scanner;

public class BonusScore02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int points = Integer.parseInt(scan.nextLine());
        double bonus;

        if (points <= 100) {
            bonus = 5;
        } else if (points <= 1000) {
            bonus = points * 0.20;
        } else {
            bonus = points * 0.10;
        }

        if (points % 2 == 0){
            bonus += 1;
        }else if (points % 10 == 5){
            bonus += 2;
        }
        System.out.println(bonus);
        System.out.println(bonus + points);
    }
}
