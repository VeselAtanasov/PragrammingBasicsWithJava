package FirstStepsInCodingLab;

import java.util.Scanner;

public class InchToSm04 {
    public static void main(String[] args) {
        // Скенер
        Scanner scanner = new Scanner(System.in);
        // Променлива за инчове -> четем от скенер
        double inch = Double.parseDouble(scanner.nextLine());
        // Променлива за см -> променлива за инч * 2.54
        double sm = inch * 2.54;
        // Принтираме променлива за см
        System.out.println(sm);
    }
}
