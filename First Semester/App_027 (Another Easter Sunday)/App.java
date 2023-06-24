import java.util.Scanner;

public class App {
public static void main(String[] args) 
{
    Scanner scan = new Scanner(System.in);
    
    int month, day, year, a, b, c, d, e, x, y;

    System.out.println("Enter the desired year:");
    year = scan.nextInt();

    x = 24;
    y = 5;
    a = year % 19;
    b = year % 4;
    c = year % 7;
    d = (19 * a + x) % 30;
    e = (2 * b + 4 * c + 6 * d + y) % 7;

    if (d + e > 9) {
        month = 4;
        day = d + e - 9;
        System.out.println("Easter Sunday is on " + day + "/" + month + "/" + year);
    } else {
        month = 3;
        day = d + e + 22;
        System.out.println("Easter Sunday is on " + day + "/" + month + "/" + year);
    }

    scan.close();

}
}
