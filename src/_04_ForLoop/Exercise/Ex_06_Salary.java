package _04_ForLoop.Exercise;

import java.util.Scanner;

public class Ex_06_Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());
        int facebook = 150;
        int instagram = 100;
        int reddit = 50;


        for (int i = 1; i <= n ; i++) {
            String tab = scanner.nextLine();

            if (tab.equals("Facebook")){
                salary -= facebook;
            }else if (tab.equals("Instagram")){
                salary -= instagram;
            }else if (tab.equals("Reddit")){
                salary -= reddit;
            }
            if (salary <= 0){
                break;
            }
        }
        if (salary <= 0){
            System.out.println("You have lost your salary.");
        }else{
            System.out.println(salary);

        }
    }
}
