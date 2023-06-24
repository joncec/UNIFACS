import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] mat = new int[2][3];
        int lin, col;

        for (lin = 0; lin < mat.length; lin++) {
            for (col = 0; col < mat[0].length; col++) {
                System.out.println("Inform the number in line " + lin + " and column " + col + ".");
                mat[lin][col] = scan.nextInt();
            }
        }

        for (lin = 0; lin < mat.length; lin++) {
            for (col = 0; col < mat[0].length; col++) {
                System.out.print(mat[lin][col] + " ");
            }
            System.out.println("");
        }

        scan.close();
    }
}
