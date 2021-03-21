package _03_ConditionalStatementsAdvanced.MoreExercises;

import java.util.Scanner;

public class Ex_05_Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String accommodation = "";
        String place = "";
        double sum = 0;

        switch (season) {
            case "Summer":
                if (budget <= 1000) {
                    accommodation = "Camp";
                    place = "Alaska";
                    sum = budget * 0.65;

                } else if (budget > 1000 && budget <= 3000) {
                    accommodation = "Hut";
                    place = "Alaska";
                    sum = budget * 0.8;
                } else {
                    accommodation = "Hotel";
                    place = "Alaska";
                    sum = budget * 0.9;
                }
                break;
            case "Winter":
                if (budget <= 1000) {
                    accommodation = "Camp";
                    place = "Morocco";
                    sum = budget * 0.45;

                } else if (budget > 1000 && budget <= 3000) {
                    accommodation = "Hut";
                    place = "Morocco";
                    sum = budget * 0.6;
                } else {
                    accommodation = "Hotel";
                    place = "Morocco";
                    sum = budget * 0.9;
                }
                break;
        }
        System.out.printf("%s - %s - %.2f",place,accommodation,sum);
        }
    }
