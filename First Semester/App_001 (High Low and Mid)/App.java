import java.util.Scanner;

public class App 
{
public static void main (String[] args) 
{
    Scanner sc = new Scanner(System.in);
    int students;
    do
    {
        System.out.println("Inform the number of students:");
        students = sc.nextInt();
    } 
    while (students<=0);
    
    sc.close();

    float[] values = new float[students];
    float high = 0, low = 10, sum = 0;
    System.out.println("Inform their grades:");
    
    for (int i = 0; i < students; i++) 
    {
        do
        {
            System.out.print("Inform the grade " + (i + 1) + ":");
            values[i] = sc.nextFloat();
            
        } while (values[i]<0 || values[i]>10);
        
            if (values[i] < low) {
                low = values[i];
            }
            if (values[i] > high) {
                high = values[i];
            }
        sum += values[i];
    }	
    
    float average=sum/students;
    
    int min, ref;
    float temp;
    for (ref=0;ref<students;ref++) 
    {
        min=ref;
        for (int j=ref+1;j<students;j++) 
        {
            if (values[j]<(values[min]))
                min=j;
        }
        if (min!=ref)
        {
            temp=values[min];
            values[min]=values[ref];
            values[ref]=temp;
        }
    }
    System.out.printf("\nHighest grade: %.1f\n", high);
    System.out.printf("The average is: %.1f\n", average);
    System.out.printf("Lowest grade: %.1f\n", low);
    
    System.out.println("\nNow the result ordered:");
    for (int i = 0; i < students; i++) 
    {
        System.out.println(values[i]);
    }
    
    }
}
