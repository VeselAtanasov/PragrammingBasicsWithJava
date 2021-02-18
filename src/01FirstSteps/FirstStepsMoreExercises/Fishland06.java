package FirstStepsMoreExercises;

import java.util.Scanner;

public class Fishland06 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double priceSkumriq = Double.parseDouble(scan.nextLine());
        double priceCaca = Double.parseDouble(scan.nextLine());
        double kgPalamud = Double.parseDouble(scan.nextLine());
        double kgSafrid = Double.parseDouble(scan.nextLine());
        int kgMidi = Integer.parseInt(scan.nextLine());


        double priceMidi = 7.50;
        double totalPalamud = (priceSkumriq + priceSkumriq * 0.60) * kgPalamud;
        double totalSafrid = (priceCaca + priceCaca * 0.80 ) * kgSafrid;
        double totalMidi = priceMidi * kgMidi;

        double allPrice = totalPalamud + totalSafrid + totalMidi;

        System.out.printf("%.2f", allPrice);

    }
}
