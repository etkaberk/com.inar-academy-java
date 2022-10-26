package chapters.chapter08.exercises08;

import java.util.Scanner;



public class exercise08_27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the matrix size's row and column : ");
        int row = input.nextInt();
        int column = input.nextInt();

        double[][] matrix = new double[row][column];
        System.out.println(" Enter a " + row + " by " + column + " matrix row by row ");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = input.nextDouble();

            }

        }
    sortColumns(matrix);
        displayArray(matrix);
    }

    public static void displayArray(double[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.printf("%-8.1f", matrix[row][col]);
            }
            System.out.println();
        }
    }


    public static void sortColumns(double[][] matrix){
        double temp;
    for (int col = 0; col < matrix.length; col++) {
        for (int row = 0; row < matrix[col].length-1; row++) {
            for (int r = row; r < matrix[col].length ; r++) {
                temp = matrix[row][col];
                if(temp > matrix[r][col])
                    matrix[row][col]= matrix[r][col];
                matrix[r][col]= temp;

            }

        }

    }
}
}
