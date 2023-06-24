import java.util.Scanner;

public class App {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inform the number of students:");
        int students = sc.nextInt();
        float[] values = new float[students];
        float high = 0, low = 10, sum = 0;
        System.out.println("Inform their grades:");
        for (int i = 0; i < students; i++) {
            System.out.print("Inform the grade " + (i + 1) + ":");
            values[i] = sc.nextFloat();

            if (values[i] < low) {
                low = values[i];
            }
            if (values[i] > high) {
                high = values[i];
            }
            sum += values[i];
        }
        float average = sum / students;
        System.out.printf("Highest grade: %.1f\n", high);
        System.out.printf("The average is: %.1f\n", average);
        System.out.printf("Lowest grade: %.1f\n", low);

        for (int i = 0; i < students - 1; i++) {
            for (int j = 0; j < students - i - 1; j++) {
                if (values[j] > values[j + 1]) {
                    float aux = values[j];
                    values[j] = values[j + 1];
                    values[j + 1] = aux;
                }
            }
        }

        System.out.println("Sorted grades:");
        for (int i = 0; i < students; i++) {
            System.out.println(values[i]);
        }
        sc.close();
    }
}
