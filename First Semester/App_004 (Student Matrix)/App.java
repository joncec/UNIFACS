import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Defining the number of students
        int students = 0;
        System.out.println("Defining the number of students.");
        do {
            System.out.println("How many students are there?");
            students = scan.nextInt();
        } while (students <= 0);

        // Defining the number of grades
        int grades = 0;
        System.out.println("Defining the number of grades.");
        do {
            System.out.println("How many grades can they have?");
            grades = scan.nextInt();
        } while (grades <= 0);

        // Defining the matrix to store student grades and average
        float[][] matrix = new float[students][grades + 1];

        // Inputting the grades for each student and calculating the average
        for (int x = 0; x < students; x++) {
            float sum = 0;
            for (int y = 0; y < grades; y++) {
                System.out.println("Enter the grade for student " + (x + 1) + " and grade " + (y + 1) + ":");
                matrix[x][y] = scan.nextFloat();
                sum += matrix[x][y];
            }
            matrix[x][grades] = sum / grades;
        }

        // Printing the average grades for each student
        System.out.println("Average grades:");
        for (int x = 0; x < students; x++) {
            System.out.println(matrix[x][grades]);
        }

        scan.close();
    }
}
