package FirstStepsInCodingLab;

import java.util.Scanner;

public class YardGreening09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceSquareMeter = 7.61;
        double orderBozhidara = Double.parseDouble(scanner.nextLine());

        double orderPrice = priceSquareMeter * orderBozhidara;

        double discount= orderPrice * 0.18;
        double finalPrice = orderPrice - discount;

        System.out.println("The final price is: " + finalPrice + " lv.");
        System.out.println("The discount is: " + discount + " lv.");
    }
}