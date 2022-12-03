package chapters.Chapter13.Exercises13.exercise13_05;

public class Rectangle extends GeometricObjectClass{
    double width = 1 ;
    double height = 1 ;
    Rectangle(){
    }
   public Rectangle(double width , double height){
        this.width = width ;
        this.height = height ;
    }
    public double getArea(){
        return width * height ;
    }
    public double getPerimeter(){
        return 2 * (width + height) ;
    }
}