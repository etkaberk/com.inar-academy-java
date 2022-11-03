package chapters.chapter09.exercises09;
//exercise09_01

public class Rectangle {
   public double width = 1;
   public double height = 1;




     public Rectangle(){
        width = 1;
        height = 1;
    }

public Rectangle(double newWidth ,double newHeight){
         width = newWidth;
         height = newHeight;
}
public double getArea(){
         return width * height;

}
public double getPerimeter(){
         return 2 * (width + height);
}
}
