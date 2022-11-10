package chapters.Chapter10.Exercises10;

public class MyPoint {
  private   double x ;
  private   double y;
public MyPoint(){
    this(0,0);
}
public MyPoint(double x , double y ){
    this.x = x ;
    this.y = y ;

}

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
public double distance(MyPoint point){
    int pointX = (int) (Math.pow((getX() - point.getY()) , 2));
    int pointY = (int) (Math.pow((getY() - point.getY()),2));

    return Math.sqrt(pointX + pointY);
}

public double distace(double x , double y){
    int pointX = (int) (Math.pow(getX() - x , 2));
    int pointY = (int) (Math.pow(getY() - y,2));

    return Math.sqrt(pointX + pointY);
}
}
