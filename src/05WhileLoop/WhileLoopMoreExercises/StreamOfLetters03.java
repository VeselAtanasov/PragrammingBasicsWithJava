package WhileLoopMoreExercises;

import java.util.Scanner;

public class StreamOfLetters03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String symbol = scanner.nextLine();

        int counterC = 0;
        int counterO = 0;
        int counterN = 0;
        String word = "";
        String secretWord = "";

        while (!symbol.equals("End")) {
            char letter = symbol.charAt(0);
            if (letter >= 'a' && letter <= 'z' || letter >= 'A' && letter <= 'Z') {

                if (symbol.equals("c") && counterC == 0) {
                    counterC++;

                } else if (symbol.equals("o") && counterO == 0) {
                    counterO++;

                } else if (symbol.equals("n") && counterN == 0) {
                    counterN++;

                } else {
                    word += letter;

                }
                if (counterC + counterN + counterO == 3) {
                    secretWord += word;
                    secretWord += " ";
                    word = "";
                    counterO = 0;
                    counterC = 0;
                    counterN = 0;
                }
            }
            symbol = scanner.nextLine();
        }
        System.out.println(secretWord);
    }
}
