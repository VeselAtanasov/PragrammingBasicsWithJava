package _02_ConditionalStatements.Lab;

import java.util.Scanner;

public class Ex_06_AreaOfFigures {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String shape = scan.nextLine();

        double area = 0;

        if (shape.equals("square")){
            double a = Double.parseDouble(scan.nextLine());
            area = a*a;
        } else if(shape.equals("rectangle")) {
            double a = Double.parseDouble(scan.nextLine());
            double b = Double.parseDouble(scan.nextLine());
            area = a * b;
        } else if(shape.equals("circle")) {
            double radius = Double.parseDouble(scan.nextLine());
            area = radius * radius * Math.PI;
        } else if(shape.equals("triangle")) {
            double a = Double.parseDouble(scan.nextLine());
            double hA = Double.parseDouble(scan.nextLine());
            area = a * hA / 2;
        }
        System.out.printf("%.3f", area);
    }
}
