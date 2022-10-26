package chapters.chapter08.exercises08;



import java.util.Scanner;

public class exercise08_28 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Enter row and column size o the matrix : ");
        int row = input.nextInt();
        int col = input.nextInt();

        int[][] m1 = getMatrix(row,col);
        int[][] m2 = getMatrix(row,col);
        System.out.print(" The two arrays are " +((equals(m1,m2) ? " " : " not ")) +" strictly identical");

    }
public static boolean equals(int[][] m1 ,int[][] m2){
    for (int r = 0; r < m1.length; r++) {
        for (int c = 0; c < m1[r].length; c++) {
            if(m1[r][c] != m2[r][c]){
                return false;
            }

        }

    }
return true;
    }
public static int[][] getMatrix(int row ,int col){
        Scanner input = new Scanner(System.in);
        int[][] m = new int[row][col];

    System.out.print("Enter the matrix : ");
    for (int i = 0; i < row; i++) {
        for (int j = 0; j < col; j++) {
            m[i][j] = input.nextInt();


        }

    }
return m;
    }
}