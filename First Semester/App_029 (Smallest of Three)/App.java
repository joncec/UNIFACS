import java.util.Scanner;

public class App {
    public static void main(String[] args) 
    {

        Scanner scan = new Scanner(System.in);

        int number1, number2, number3, smallest;

        System.out.println("Type in three whole numbers (press enter after each)");

        number1 = scan.nextInt();
        number2 = scan.nextInt();
        number3 = scan.nextInt();

        if (number1 == number2 && number1 == number3 && number2 == number3) {
            System.out.println("The numbers are equal");
        } else {
            smallest = (number1 < number2) ? ((number1 < number3) ? number1 : number3) : ((number2 < number3) ? number2 : number3);
            System.out.println("The smallest number is " + smallest);
        }
        scan.close();
    }
}
