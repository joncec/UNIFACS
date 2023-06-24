import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] mat = new int[3][3];
		int lin, col;

		for (lin = 0; lin < mat.length; lin++) 
		{
			for (col = 0; col < mat[0].length; col++) 
			{
				do 
				{
				System.out.println("Inform the number in line " + lin + " and column " + col + ".");
				mat[lin][col] = scan.nextInt();
				} while (mat[lin][col] < 0);
			}
		}
		scan.close();

		for (lin = 0; lin < mat.length; lin++) 
		{
			for (col = 0; col < mat[0].length; col++) 
			{
				System.out.print(mat[lin][col] + " ");
			}
			System.out.println("");
		}
		int sumdia=0, sumsec=0;
		for (int i=0;i<3;i++) 
		{
			sumdia += mat[i][i];
			sumsec += mat[i][2-i];
		}
		System.out.println("Sum of the main diagonal: " + sumdia);
		System.out.println("Sum of the secondary diagonal: " +sumsec);
	}
}