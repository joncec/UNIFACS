import java.util.Scanner;

public class App {

public static void main(String[] args) 
{

    Scanner scan = new Scanner(System.in);

    System.out.println("Enter an integer to check if it's even or odd:");

    if (scan.hasNextInt()) {
        int num = scan.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " is Even");
        } else {
            System.out.println(num + " is Odd");
        }
    } else {
        System.out.println("Invalid input. Please enter an integer.");
    }

    scan.close();
}
}
