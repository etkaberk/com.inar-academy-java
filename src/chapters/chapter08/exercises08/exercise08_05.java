package chapters.chapter08.exercises08;

import java.util.Scanner;

public class exercise08_05 {
    public static void main(String[] args) {
        double[][] matrix1 = getMatrix();
        double[][] matrix2 = getMatrix();

        double[][] totalMatrix = addMatrix(matrix1 ,matrix2);
        displayTheResult(matrix1, matrix2 , totalMatrix);

    }

    public static void displayTheResult(double[][] matrix1, double[][] matrix2, double[][] totalMatrix) {
        for (int row = 0; row < matrix1.length; row++) {

            for (int col = 0; col < matrix1[row].length; col++) {
                System.out.printf("%-3.1f ", matrix1[row][col]);
            }

            if (row == 1) {
                System.out.printf("%5s", "  +  ");
            } else {
                System.out.printf("%5s", " ");
            }

            for (int col = 0; col < matrix2[row].length; col++) {
                System.out.printf("%-3.1f ", matrix2[row][col]);
            }

            if (row == 1) {
                System.out.printf("%5s", "  =  ");
            } else {
                System.out.printf("%5s", " ");
            }

            for (int col = 0; col < matrix2[row].length; col++) {
                System.out.printf("%-3.1f ", totalMatrix[row][col]);
            }
            System.out.println();
        }
    }

    public static double[][] addMatrix(double[][] matrix1, double[][] matrix2) {
        double[][] matrixResult = new double[3][3];
        for (int row = 0; row < matrixResult.length; row++) {
            for (int col = 0; col < matrixResult[row].length; col++) {
                matrixResult[row][col] = (matrix1[row][col] + matrix2[row][col]);
            }

        }
    return matrixResult;
    }

    public static double[][] getMatrix() {
        Scanner input = new Scanner(System.in);
        double[][] matrix = new double[3][3];
        System.out.println("Enter matrix : ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextDouble();
            }

        }
        return matrix;
    }


}

