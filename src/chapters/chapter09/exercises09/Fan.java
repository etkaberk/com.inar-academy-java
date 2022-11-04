package chapters.chapter09.exercises09;


public class Fan {
   public final static int SLOW = 1;
   public final static int MEDIUM = 2;
   public final static int FAST = 3;


   private int speed;
   private boolean on;
   private double radius;
   String color;

   public Fan(){
       this.speed = SLOW;
       this.on = false;
       this.radius = 5;
       this.color ="blue";

   }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }
public String toString(){
       if (on == true){
           return "Fan speed :   " + getSpeed() + "  color is : " + color + "  radius :  " + radius;

       }else{
           return "Fan color:  " + color + "  radius: " + radius +  "   Fan is off!!!!";
       }
}
}
