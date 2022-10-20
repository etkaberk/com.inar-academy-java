package chapters.chapter08.exercises08;

import java.util.Scanner;

public class exercise08_01 {
    public static void main(String[] args) {
        double[][] matrix = getFromUser();
        double[] sumsOfColumns = sumColumns(matrix);
        display(sumsOfColumns);

    }

    public static double[] sumColumns(double[][] matrix) {
        double[] sums = new double[4];
        for (int column = 0; column < matrix[0].length; column++) {
            double sum = 0;
            for (int row = 0; row < matrix.length; row++) {
                sum += matrix[row][column];

            }
            sums[column] = sum;
        }
        return sums;
    }

    public static void display(double[] sumsOfColumns) {
        for (int i = 0; i < sumsOfColumns.length ; i++) {
            System.out.println("sum of the columns " + i + " is " + sumsOfColumns[i] );

        }
    }

    public static double[][] getFromUser() {
        Scanner input = new Scanner(System.in);
        double[][] matrix = new double[3][4];
        System.out.println("enter a matrix(3 by 4) : ");
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = input.nextDouble();

            }

        }
        return matrix;
    }

}
