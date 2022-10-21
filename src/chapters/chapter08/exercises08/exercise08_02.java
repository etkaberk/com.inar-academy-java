package chapters.chapter08.exercises08;

import java.util.Scanner;

public class exercise08_02 {
    public static void main(String[] args) {
        double[][] matrix = getMatrixFromUser();
        double sumOfMajorDiagonal = sumMajorDiagonal(matrix);
        System.out.println("Sum of the elements in the major diagonal is " + sumOfMajorDiagonal);
    }

    public static double[][] getMatrixFromUser() {
        Scanner input = new Scanner(System.in);

        double[][] matrix = new double[4][4];
        System.out.println("Enter a 4-by-4 matrix row by row: ");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }
        return matrix;
    }


    public static double sumMajorDiagonal(double[][] matrix) {
        double sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
            
        }
    return sum;
    }
}
