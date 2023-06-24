import java.util.Scanner;

public class App 
{
public static void main(String[] args) 
{
    int a, b, temp;
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Type in the lower limiter:");
    a=sc.nextInt();
    
    System.out.println("Type in the higher limiter:");
    b=sc.nextInt();
    
    sc.close();
    
    if (a>b)
    {
        temp=a;
        a=b;
        b=temp;
    
        if (a%2==0)
            a++;
        
        if (b%2==0)
            b--;
    }
    else
    {
    System.out.println("There is no odd number.");
    return;
    }
    for (int x=a; x<=b; x=x+2)
        System.out.println(x);
}

}