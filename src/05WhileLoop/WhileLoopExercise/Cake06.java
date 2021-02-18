package WhileLoopExercise;

import java.util.Scanner;

public class Cake06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());

        int cake = width * length;
        int counter = 0;

        String input = "";

        while (counter < cake && !"STOP".equals(input = scanner.nextLine())) {
            counter += Integer.parseInt(input);
        }
        int piecesNeeded = Math.abs(counter - cake);
        if (input.equals("STOP")) {
            System.out.printf("%d pieces are left.", piecesNeeded);
        } else {
            System.out.printf("No more cake left! You need %d pieces more.", piecesNeeded);
        }
    }
}
