package ConditionalStatementsMoreExercises;

import java.util.Scanner;

public class TransportPrice04 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int km = Integer.parseInt(scan.nextLine());
        String when = scan.nextLine();

        double taxiDayPrice = 0.79; // лв.км
        double taxiNightPrice = 0.90; // лв.км
        double taxiStand = 0.70;   // първоначална такса
        double busNightPrice = 0.09; // лв.км
        double bus = km * busNightPrice;
        double taxi = 0;              // км минумум разстояние
        double busMinDistance = 20;   // км минимум разстояние
        double trainNightPrice = 0.06; // лв.км
        double train = km * trainNightPrice;
        double trainMinDistance = 100; // км минимум разстояние

        // Да се отпечата на конзолата най-ниската цена за посочения брой километри, форматирана до втория знак след десетичния разделител.

        if (when.equals("day")){
            taxi = (km * taxiDayPrice) + taxiStand;
        }
        else if (when.equals("night")){
            taxi = (km * taxiNightPrice) + taxiStand;
        }

        if (km < 20){
            System.out.printf("%.2f",taxi);
        }

        else if (km >= busMinDistance && km < trainMinDistance){
            double transport = Math.min(taxi,bus);
            System.out.printf("%.2f",transport);
        }

        else if (km >= trainMinDistance){
            double transport = Math.min(bus,train);
            System.out.printf("%.2f",transport);
        }
    }
}

