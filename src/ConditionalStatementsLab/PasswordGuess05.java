package ConditionalStatementsLab;

import java.util.Scanner;

public class PasswordGuess05 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String password = String.valueOf(scan.nextLine());

        if (password.equals("s3cr3t!P@ssw0rd")){
            System.out.println("Welcome");
        } else {
            System.out.println("Wrong password!");
        }
    }
}
