import java.util.Scanner;

public class App {

public static void main(String[] args) {
    int a, b, c, d, e, f, g, h, i, j, k, l;
    int month, day, year;

    Scanner scan = new Scanner(System.in);

    System.out.println("Enter the year:");
    year = scan.nextInt();

    a = year % 19;
    b = year / 100;
    c = year % 100;
    d = b / 4;
    e = b % 4;
    f = (b + 8) / 25;
    g = (b - f + 1) / 3;
    h = (19 * a + b - d - g + 15) % 30;
    i = c / 4;
    j = c % 4;
    k = (32 + 2 * e + 2 * i - h - j) % 7;
    l = (a + 11 * h + 22 * k) / 451;
    month = (h + k - 7 * l + 114) / 31;
    day = (h + k - 7 * l + 114) % 31 + 1;

    System.out.println("Easter Sunday is: " + day + "/" + month + "/" + year);

    scan.close();
}
}
