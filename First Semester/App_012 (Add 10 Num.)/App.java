import java.util.Scanner;

public class App {
public static void main(String[] args) 
{
    Scanner sc = new Scanner (System.in);

    int sum=0;
    int [] values = new int[10];

    System.out.println("This adds 10 numbers:");

    for (int i=0 ;i<10; i++)
    {
        System.out.println("Inform the number "+(i+1));
        values[i]=sc.nextInt();
        sum+=values[i];
    }

    System.out.println("The result is: "+ sum);
    sc.close();
}

}