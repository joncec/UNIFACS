
import java.util.Scanner;

public class App {
public static void main(String[] args) 
{
    Scanner sc = new Scanner(System.in);
    long num;
    
    do {
        System.out.println("Type in a number, I'll factor it.");
        num = sc.nextLong();
        
        if (num <= 0) {
            System.out.println("Number must be greater than 0. Please try again.");
        } else {
            long result = factoration(num);
            System.out.println(num + "! = " + result);
        }
    } while (num <= 0);
    
    sc.close();
}

public static long factoration(long num) {
    long factored = 1;
    for (long i = num; i >= 1; i--) {
        factored *= i;
    }
    return factored;
}

}
