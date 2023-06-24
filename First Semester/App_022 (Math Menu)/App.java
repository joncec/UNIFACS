import java.util.Scanner;

public class App {
public static void main(String[] args) 
{
    Scanner sc = new Scanner(System.in);
    int ct;
    
    do {
        System.out.println("Type in a number:");
        double n1 = sc.nextDouble();
        
        System.out.println("Type in another number:");
        double n2 = sc.nextDouble();
        
        System.out.println("Type in an operation (+, -, *, /):");
        char op = sc.next().charAt(0);
        
        double result;

        switch (op) 
        {
            case '+':
                result = n1 + n2;
                System.out.println("The result is: " + result);
                break;
            case '-':
                result = n1 - n2;
                System.out.println("The result is: " + result);
                break;
            case '*':
                result = n1 * n2;
                System.out.println("The result is: " + result);
                break;
            case '/':
                if (n2 == 0) {
                    System.out.println("Can't divide by zero.");
                    break;
                }
                result = n1 / n2;
                System.out.println("The result is: " + result);
                break;
            default:
                System.out.println("Invalid operator. Please enter a valid operator (+, -, *, /).");
                break;
        }

        System.out.println("Continue? (1)Yes / (2)No");
        ct = sc.nextInt();
    } while (ct == 1);

    sc.close();
}
}