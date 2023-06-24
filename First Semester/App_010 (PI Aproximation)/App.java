import java.util.Scanner;

public class App {
public static void main(String[] args) 
{
    Scanner scan = new Scanner(System.in);
    int userValue;
    do {
        System.out.print("How many iterations of PI's digits should be calculated?");
        userValue = scan.nextInt();
    } while (userValue < 0);
    
    scan.close();

    double PI = 0;
    int s = 1;
    for (int i = 1; i <= userValue; i += 2) {
        PI += s * 4.0 / i;
        s = -s;
    }

    System.out.println(PI);
    System.out.println(Math.PI);
}
}
