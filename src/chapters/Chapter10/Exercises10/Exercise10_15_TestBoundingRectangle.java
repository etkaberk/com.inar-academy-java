package chapters.Chapter10.Exercises10;

import java.util.Scanner;

public class Exercise10_15_TestBoundingRectangle {
    public Exercise10_15_TestBoundingRectangle() {
    }

    public static void main(String[] args) {
        Scanner inoput = new Scanner(System.in);
        System.out.println( "enter 5 points : ");
        double[][] points = new double[5][2];

        for (int p = 0; p < points.length; p++) {
            points[p][0] = inoput.nextDouble();
            points[p][1] = inoput.nextDouble();
        }
    MyRectangle2D r = getRectangle(points);
        System.out.println("the bounding rectangle center is( " +r.getX() + " , " + r.getY() + " ) width " + r.getWidth() + " , height " + r.getHeight() );



    }

    public static MyRectangle2D getRectangle(double[][] points) {
        double x = points[0][0];
        double y = points[0][1];
        double x2 = points[0][0];
        double y2 = points[0][1];
for(int i = 1 ; i < points.length; i++){
    if (points[i][0] < x) x = points[i][0];
    if (points[i][1] < y) y = points[i][1];
    if (points[i][0] > x2) x2 = points[i][0];
    if (points[i][1] > y2) y2 = points[i][1];
}
double width = x2 - x ;
double height = y2 - y;
double centeralX = x2 - width / 2;
double centeralY = y2 - height / 2;


        return(new MyRectangle2D(centeralX,centeralY,width,height));


    }


}
