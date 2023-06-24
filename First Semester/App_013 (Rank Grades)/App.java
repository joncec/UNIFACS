import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int students;
        do {
            System.out.println("Enter the number of students (must be a positive integer):");
            while (!sc.hasNextInt()) {
                System.out.println("Invalid input. Please enter a positive integer:");
                sc.next();
            }
            students = sc.nextInt();
        } while (students <= 0);

        float[] values = new float[students];
        float high = 0, low = 10, sum = 0;

        System.out.println("Enter the grades for each student:");

        for (int i = 0; i < students; i++) {
            System.out.print("Enter the grade " + (i + 1) + ": ");
            try {
                values[i] = sc.nextFloat();

                if (values[i] < low) {
                    low = values[i];
                }
                if (values[i] > high) {
                    high = values[i];
                }
                sum += values[i];
            } catch (InputMismatchException e) {
                System.out.println("Invalid grade entered. Please enter a numeric value.");
                sc.nextLine();
                i--;
            }
        }

        sc.close();

        float average = sum / students;

        System.out.printf("Highest grade: %.1f\n", high);
        System.out.printf("Average grade: %.1f\n", average);
        System.out.printf("Lowest grade: %.1f\n", low);
    }
}
