package chapters.chapter08.exercises08;

import java.util.Scanner;

public class exercise08_34 {
    public static void main(String[] args) {
        double[][] points = new double[6][2];
        getPoints(points);

        double[] result = getRigthMostLowestPoint(points);

        System.out.println("the rigth most lowest point is  : " + result[0] + " , " + result[1]);

    }
public static void getPoints(double[][] points){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter points : ");
    for (int row = 0; row < points.length; row++) {
        for (int col = 0; col < points[row].length; col++) {
            points[row][col] = input.nextDouble();

        }

    }
}

public static double[] getRigthMostLowestPoint(double[][] points){
        double a = points[0][0];
        double b = points[0][1];
    for (int i = 1; i < points.length; i++) {
        if(b > points[i][1]){
            a = points[i][0];
            b = points[i][1];
        }
        else if(b == points[i][1] && points[i][0] > a ){
            a = points[i][0];
            b = points[i][1];
        }
    }
     double[] result = {a,b};
    return result;
}
}
