package FirstStepsInCodingLab;

import java.util.Scanner;

public class UserInputTESTS {
    public static void main(String[] args) {
        // 1.тип кутия -> кутия за обувки
        // 2.име на кутия -> Adidas Summer
        // 3.стойността в кутията -> Обувките
        //int countOfPeople = 400;
        //double numberPi = 3.14;
        //String myName = "Vesel";
        //int amountOfMoney = 150;


        //Scanner scanner = new Scanner(System.in);
        //String name = scanner.nextLine();
        //System.out.println(name);

        Scanner scanner = new Scanner(System.in);
        String myCity = scanner.nextLine();
        double examGrade = Double.parseDouble(scanner.nextLine());
        int amountOfMoney = Integer.parseInt(scanner.nextLine());
        System.out.println(amountOfMoney);
    }
}
