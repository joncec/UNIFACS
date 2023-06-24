import java.util.Scanner;

public class App {
public static void main(String[] args) 
{
    Scanner sc = new Scanner(System.in);
    int result, multiplier, number, continueChoice;

    do {
        multiplier = 0;

        System.out.println("Type in a number you want the table for:");
        number = sc.nextInt();

        while (multiplier <= 10) {
            result = number * multiplier;
            System.out.println(number + " X " + multiplier + " = " + result);
            multiplier++;
        }

        System.out.println("Do you wish to continue? (1) Yes / (2) No");
        continueChoice = sc.nextInt();
    } while (continueChoice == 1);

    sc.close();
}
}
