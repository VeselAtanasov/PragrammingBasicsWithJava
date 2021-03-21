package _05_NestedLoops.Lab;

public class Ex_02_MultiplicationTable {
    public static void main(String[] args) {
        for (int x = 1; x <= 10; x++) {
            for (int y = 1; y <= 10; y++) {
                int product = x * y;
                System.out.printf("%d * %d = %d\n", x, y, product);

            }
        }
    }
}
