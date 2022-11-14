package weeks.week_14;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Car extends Vehicle {
    public static final int NUMBER_OF_WHEEL = 4;
    private String plaka ;
    private String brand;

    public Car(){
        this(true,2,1000,"white" , 4,"35 EBO 1616","BMW");
    }
    public Car(boolean hasEngine,int numberOfPassenger,double weight,String color,int numberOfWheel,String plaka,String brand){
        super(hasEngine,numberOfPassenger,weight,color,NUMBER_OF_WHEEL);
        this.plaka = plaka;
        this.brand = brand;

    }

    public String getPlaka() {
        return plaka;
    }

    public void setPlaka(String plaka) {
        this.plaka = plaka;
    }

    public String getBrand() {
        return brand;
    }
    @Override
public void goes(){
    System.out.println(" Car is  moving!");
}
}

