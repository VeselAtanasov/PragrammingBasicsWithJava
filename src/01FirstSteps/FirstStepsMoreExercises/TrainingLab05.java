package FirstStepsMoreExercises;

import java.util.Scanner;

public class TrainingLab05 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double width = Double.parseDouble(scan.nextLine());
        double height = Double.parseDouble(scan.nextLine());


        double widthCorridor = 1.00;
        double widthWorkSpace = 0.70;
        double heightWorkSpace = 1.20;

        double deskPerRow = (height - widthCorridor) / widthWorkSpace;
        int deskPerRow1 = (int) deskPerRow;
        double deskRow = width / heightWorkSpace;
        int deskRow2 = (int) deskRow;

        double totalSpace = deskPerRow1 * deskRow2 - 3;

        System.out.printf("%.0f",totalSpace);

    }
}
