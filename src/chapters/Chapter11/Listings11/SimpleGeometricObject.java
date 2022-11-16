package chapters.Chapter11.Listings11;

import org.omg.CORBA.PUBLIC_MEMBER;

public class SimpleGeometricObject {
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;
    //construct a default geometric object
    public SimpleGeometricObject(){
        dateCreated = new java.util.Date();
    }
    //construct a geometric object with the specified color and filled value
    public SimpleGeometricObject(String color ,boolean filled){
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }
    //return color
public String getColor(){
        return color;
}
//set a new color
public void setColor(String color){
        this.color = color;
}
//return filled.Since filled is boolean,its getter method is named isFilled
public void setFilled(boolean filled){
        this.filled = filled;
}
//get dateCreated
public java.util.Date getDateCreated(){
        return dateCreated;
}
//return a string representation of this object
public String toString(){
        return "created on " + dateCreated + "\ncolor: " + color + " and filled : " + filled;
}

}
