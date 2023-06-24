import java.util.Scanner;

public class unifacs_experiment_2 {
    
public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    int firstNumber;
    int secondNumber;
    int sum;
    
    System.out.println("Insert the value of x:");
    firstNumber = scan.nextInt();
    
    System.out.println("Insert the value of y:");
    secondNumber = scan.nextInt();
    
    sum = firstNumber + secondNumber;
    
    System.out.println("The sum of " + firstNumber + " + " + secondNumber + " is: " + sum);
    
    scan.close();
    
}
}
