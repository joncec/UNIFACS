import java.util.Scanner;

public class App {

public static void main(String[] args) 
{
	Scanner scan = new Scanner(System.in);

	int[][] mat = new int[4][3];
	int lin, col;

	for (lin = 0; lin < mat.length; lin++) 
	{
		for (col = 0; col < mat[0].length; col++) 
		{
			do
			{
			System.out.println("Inform the number in line " + lin + " amd column " + col + ".");
			mat[lin][col] = scan.nextInt();
			} while (mat[lin][col]<0);
		}
	}
	scan.close();
	System.out.println("| Matrix Pre Op |");
	for (lin = 0; lin < mat.length; lin++) 
	{
		for (col = 0; col < mat[0].length; col++) 
		{
			System.out.print(mat[lin][col] + " ");
		}
		System.out.println("");
	}
	System.out.println("| Matrix Post Op |");
	for (lin = 0; lin < mat.length; lin++)
	{
		for (col = 0; col < mat[0].length; col++)
		{
			if (mat[lin][col]%2==0) {
				mat[lin][col]=0;
				
			} else {
				mat[lin][col]=1;
			}
			System.out.print(mat[lin][col]+" ");
		}
		System.out.println("");
	}	

}

}