package chapters.chapter08.exercises08;

import static chapters.chapter08.exercises08.exercise08_05.getMatrix;

public class exercise08_06 {
    public static void main(String[] args) {


        double[][] matrix1 = getMatrix();
        double[][] matrix2 = getMatrix();

        double[][] matrixMultiplied = multiplyMatrix(matrix1, matrix2);

        displayResult(matrix1, matrix2, matrixMultiplied);


    }

    public static double[][] multiplyMatrix(double[][] matrix1, double[][] matrix2) {
        double[][] matrixMultiplied = new double[matrix1.length][matrix1[0].length];
        for (int row = 0; row < matrixMultiplied.length; row++) {
            for (int col = 0; col < matrixMultiplied[row].length; col++) {
                matrixMultiplied[row][col] = matrix1[row][0]*matrix2[0][col];
                matrixMultiplied[row][col] +=  matrix1[row][1]*matrix2[1][col];
                matrixMultiplied[row][col] += matrix1[row][2] * matrix2[2][col];
            }

        }
        return matrixMultiplied;
    }

    public static void displayResult(double[][] matrix1, double[][] matrix2, double[][] matrixMultiplied) {
        for (int row = 0; row < matrix1.length; row++) {

            for (int col = 0; col < matrix1[row].length; col++) {
                System.out.printf("%-3.1f ", matrix1[row][col]);
            }

            if (row == 1) {
                System.out.printf("%5s", "  *  ");
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
                System.out.printf("%-3.1f ", matrixMultiplied[row][col]);
            }
            System.out.println();
        }
    }
}
