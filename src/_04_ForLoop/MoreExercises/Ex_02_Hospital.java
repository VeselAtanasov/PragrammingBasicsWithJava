package _04_ForLoop.MoreExercises;

import java.util.Scanner;

public class Ex_02_Hospital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int doctors = 7;
        int treatedPatients = 0;
        int unTreatedPatients = 0;

        for (int i = 1; i <= days; i++) {
            int patients = Integer.parseInt(scanner.nextLine());
            if (i % 3 == 0) {
                if (unTreatedPatients > treatedPatients) {
                    doctors++;
                }
            }
            if (patients <= doctors) {
                treatedPatients += patients;

            } else {
                treatedPatients += doctors;
                unTreatedPatients += (patients - doctors);
            }
        }
        System.out.printf("Treated patients: %d.\n" , treatedPatients);
        System.out.printf("Untreated patients: %d." , unTreatedPatients);
    }
}
