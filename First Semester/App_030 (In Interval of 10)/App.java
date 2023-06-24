import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) 
    {

        Scanner scan = new Scanner(System.in);

        float value;

        System.out.println("Type in the value:");
        
        try {
            value = scan.nextFloat();
            if (value >= 0 && value <= 10) {
                System.out.println("The value " + value + " is within the valid range of 0 to 10.");
            } else {
                System.out.println("The value " + value + " is outside the valid range of 0 to 10.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a numeric value.");
        }
        scan.close();
    }
}
