package _07_ProgrammingBasicsExams;

import java.util.Scanner;

public class Ex_05_Oscars05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameActor = scanner.nextLine();
        double points = Double.parseDouble(scanner.nextLine());
        int jury = Integer.parseInt(scanner.nextLine());
        boolean nominated = false;

        for (int i = 1; i <= jury; i++) {
            String juryName = scanner.nextLine();
            double juryPoints = Double.parseDouble(scanner.nextLine());


            points = points + (juryName.length() * juryPoints / 2);

            if (points >= 1250.5) {
                nominated = true;
                break;
            }
        }
            if (nominated) {
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", nameActor, points);
            } else {
                System.out.printf("Sorry, %s you need %.1f more!", nameActor, 1250.50 - points);
            }
        }
    }

