package chapters.Chapter11.Exercises11.Exercise11_01;



import java.util.Date;

public class GeometricObject {
    private String color ;
    private boolean filled;
    private java.util.Date dateCreated;

    public GeometricObject(){
        this("white",false);
        dateCreated = new Date();
    }

    public GeometricObject(String color,boolean filled){
        dateCreated = new Date();
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

public String toString(){
        return "Created on " + dateCreated + "\ncolor : " + color + " and ?filled?" + filled;
 }
}
