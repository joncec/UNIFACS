import java.util.Scanner;

public class App {
public static void main(String[] args) 
{
    Scanner sc = new Scanner(System.in);

    float[] x = new float[25];

    for (int i = 0; i < 25; i++) {
        System.out.println("Enter a floating-point number:");
        x[i] = sc.nextFloat();
    }

    sc.close();

    System.out.println("Numbers entered:");
    for (int i = 0; i < 25; i++) {
        System.out.println(x[i]);
    }
}
}
