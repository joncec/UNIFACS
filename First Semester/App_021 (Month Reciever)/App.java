import java.util.Scanner;

public class App {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int M;

    System.out.println("Type in the number of a month:");
    if (sc.hasNextInt()) {
        M = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        if (M >= 1 && M <= 12) {
            String[] monthNames = {
                "", "January", "February", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December"
            };
            System.out.println(monthNames[M]);
        } else {
            System.out.println("Invalid month number.");
        }
    } else {
        System.out.println("Invalid input. Please enter a valid month number.");
    }

    sc.close();
}
}
