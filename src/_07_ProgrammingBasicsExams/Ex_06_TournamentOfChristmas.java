package _07_ProgrammingBasicsExams;

import java.util.Scanner;

public class Ex_06_TournamentOfChristmas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int allWins = 0;
        int allLoses = 0;
        double allMoney = 0;
        int counterWin = 0;
        int counterLoose = 0;
        double dailyMoney = 0;

        for (int i = 1; i <= days; i++) {

            while (true) {
                String input = scanner.nextLine();
                if (input.equals("Finish")) {
                    if (counterWin > counterLoose) {
                        dailyMoney *= 1.1;
                        allWins++;

                    } else if (counterWin < counterLoose && counterLoose != 0) {
                        allLoses++;
                    }
                    allMoney += dailyMoney;
                    counterWin = 0;
                    counterLoose = 0;
                    dailyMoney = 0;
                    break;
                }
                String result = scanner.nextLine();
                if (result.equals("win")) {
                    dailyMoney += 20;
                    counterWin++;
                } else if (result.equals("lose")) {
                    counterLoose++;
                }
            }
        }
        if (allWins > allLoses) {
            allMoney *= 1.2;
            System.out.printf("You won the tournament! Total raised money: %.2f", allMoney);
        } else {
            System.out.printf("You lost the tournament! Total raised money: %.2f", allMoney);
        }
    }
}
