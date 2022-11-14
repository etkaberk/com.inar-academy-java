package weeks.week_14;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Vehicle {
    public static final int MIN_PASSENGER_NUMBER = 5;
    protected  boolean hasEngine;
    protected int numberOfPassenger;
    protected  double weight;
    protected String color;
    protected int numberOfWheel;


    public Vehicle(boolean hasEngine,int numberOfPassenger,double weight , String color , int numberOfWheel ){
        this.hasEngine = hasEngine;
        this.numberOfPassenger = numberOfPassenger;
        this.weight = weight;
        this.color = color;
        this.numberOfWheel = numberOfWheel;

    }

    public boolean isHasEngine() {
        return this.hasEngine;
    }

    public void setHasEngine(boolean hasEngine) {
        this.hasEngine = hasEngine;
    }

    public int getNumberOfPassenger() {
        return this.numberOfPassenger;
    }

    public void setNumberOfPassenger(int numberOfPassenger) {
        this.numberOfPassenger = numberOfPassenger;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfWheel() {
        return this.numberOfWheel;
    }

    public void setNumberOfWheel(int numberOfWheel) {
        this.numberOfWheel = numberOfWheel;
    }
    final public void purpoe(){
        System.out.println("Use for transfort.");
    }

public void goes(){
    System.out.println(" vehicle is  moving!");
}

}

