package ProgrammingBasicsOnlineExam;

import java.util.Scanner;

public class FootballSouvenirs03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String team = scanner.nextLine();
        String souvenir = scanner.nextLine();
        int amountSouvenirs = Integer.parseInt(scanner.nextLine());

        double sum = 0;
        boolean souv = false;

        switch (team) {
            case "Argentina":
                switch (souvenir) {
                    case "flags":
                        sum = 3.25;
                        souv = true;
                        break;
                    case "caps":
                        sum = 7.2;
                        souv = true;
                        break;
                    case "posters":
                        sum = 5.1;
                        souv = true;
                        break;
                    case "stickers":
                        sum = 1.25;
                        souv = true;
                        break;
                    default:
                        System.out.print("Invalid stock!");
                }
                break;
            case "Brazil":
                switch (souvenir) {
                    case "flags":
                        sum = 4.2;
                        souv = true;
                        break;
                    case "caps":
                        sum = 8.5;
                        souv = true;
                        break;
                    case "posters":
                        sum = 5.35;
                        souv = true;
                        break;
                    case "stickers":
                        sum = 1.2;
                        souv = true;
                        break;
                    default:
                        System.out.print("Invalid stock!");
                }
                break;

            case "Croatia":
                switch (souvenir) {
                    case "flags":
                        sum = 2.75;
                        souv = true;
                        break;
                    case "caps":
                        sum = 6.9;
                        souv = true;
                        break;
                    case "posters":
                        sum = 4.95;
                        souv = true;
                        break;
                    case "stickers":
                        sum = 1.1;
                        souv = true;
                        break;
                    default:
                        System.out.print("Invalid stock!");
                }
                break;
            case "Denmark":
                switch (souvenir) {
                    case "flags":
                        sum = 3.1;
                        souv = true;
                        break;
                    case "caps":
                        sum = 6.5;
                        souv = true;
                        break;
                    case "posters":
                        sum = 4.8;
                        souv = true;
                        break;
                    case "stickers":
                        sum = 0.9;
                        souv = true;
                        break;
                    default:
                        System.out.print("Invalid stock!");
                }
                break;
            default:
                System.out.print("Invalid country!");
        }
        double total = sum * amountSouvenirs;
        if (souv)
            System.out.printf("Pepi bought %d %s of %s for %.2f lv.", amountSouvenirs, souvenir, team, total);
    }
}
