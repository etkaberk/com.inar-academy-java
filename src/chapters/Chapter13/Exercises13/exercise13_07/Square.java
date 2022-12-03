package chapters.Chapter13.Exercises13.exercise13_07;

import chapters.Chapter13.Exercises13.exercise13_05.GeometricObjectClass;

public class Square extends GeometricObjectClass implements Colorable{
     double side;
    public Square(){
        this(1);
    }
public Square(double side){
        this.side = side;
}
@Override
    public double getArea(){
        return side * side;
}
@Override
    public double getPerimeter(){
        return 4 * side;

}
@Override
    public void howToColor(){
    System.out.println("Color all four sides");
}

}

