package FirstStepsInCodingExercise;

import java.util.Scanner;

public class CharityCampaign06 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //•	Торта - 45 лв.
        //•	Гофрета - 5.80 лв.
        //•	Палачинка - 3.20 лв.

        //1.	Броят на дните, в които тече кампанията – цяло число в интервала [0 … 365]
        //2.	Броят на сладкарите – цяло число в интервала [0 … 1000]
        //3.	Броят на тортите – цяло число в интервала [0… 2000]
        //4.	Броят на гофретите – цяло число в интервала [0 … 2000]
        //5.	Броят на палачинките – цяло число в интервала [0 … 2000]

        // Да се отпечата на конзолата едно число:
        //•	парите, които са събрани.
        // Резултатът да се форматира до вторта цифра след десетичната запетая.

        int days = Integer.parseInt(scan.nextLine());
        int cookers = Integer.parseInt(scan.nextLine());
        int cakes = Integer.parseInt(scan.nextLine());
        int waffles = Integer.parseInt(scan.nextLine());
        int pancakes = Integer.parseInt(scan.nextLine());

        int cakePrice = cakes * 45;
        double wafflesPrice = waffles * 5.80;
        double pancakesPrice = pancakes * 3.20;
        double sumDayCookers = (cakePrice + wafflesPrice + pancakesPrice) * cookers;
        double totalSum = sumDayCookers * days;
        double totalWin = totalSum - totalSum / 8;


        System.out.printf("%.2f", totalWin);

    }
}
