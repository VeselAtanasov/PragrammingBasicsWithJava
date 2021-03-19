package exam;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double width = Double.parseDouble(scanner.nextLine());
        double length = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());
        double average = Double.parseDouble(scanner.nextLine());

        double volume = width * length * height;
        double room = (average + 0.40) * 2 * 2;
        double space = Math.floor(volume / room);


        if (space >= 3 && space <= 10) {
            System.out.printf("The spacecraft holds %.0f astronauts.", space);
        } else if (space < 3) {
            System.out.print("The spacecraft is too small.");
        } else {
            System.out.print("The spacecraft is too big.");
        }
    }
}
