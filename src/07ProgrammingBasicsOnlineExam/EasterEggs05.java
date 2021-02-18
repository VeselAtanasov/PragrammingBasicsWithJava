package ProgrammingBasicsOnlineExam;

import java.util.Scanner;

public class EasterEggs05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int paintedEggs = Integer.parseInt(scanner.nextLine());

        int redEggs = 0;
        int blueEggs = 0;
        int greenEggs = 0;
        int orangeEggs = 0;

        for (int i = 1; i <= paintedEggs ; i++) {
            String color = scanner.nextLine();

            if (color.equals("red")) {
                redEggs++;
            } else if (color.equals("orange")){
                orangeEggs++;
            } else if (color.equals("blue")){
                blueEggs++;
            } else if (color.equals("green")){
                greenEggs++;
            }
        }

        int maxEggs = redEggs;
        String maxColour = "red";

        if (orangeEggs > maxEggs) {
            maxEggs = orangeEggs;
            maxColour = "orange";
        }
        if (blueEggs > maxEggs) {
            maxEggs = blueEggs;
            maxColour = "blue";
        }
        if (greenEggs > maxEggs){
            maxEggs = greenEggs;
            maxColour = "green";
        }

        System.out.printf("Red eggs: %d\n", redEggs);
        System.out.printf("Orange eggs: %d\n", orangeEggs);
        System.out.printf("Blue eggs: %d\n", blueEggs);
        System.out.printf("Green eggs: %d\n", greenEggs);
        System.out.printf("Max eggs: %d -> %s", maxEggs, maxColour );
    }
}
