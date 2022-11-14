package weeks.week_14;



public class Animal {
    protected  double weight;
    protected   double height;
    protected boolean hasSwimmingSkills;
    protected boolean hasFlyingSkills;

    public Animal(){
        this(0,0,false,false);
    }
public Animal(double weight,double height,boolean hasSwimmingSkills,boolean hasFlyingSkills){
        this.weight = 0;
        this.height = 0;
        this.hasSwimmingSkills = false;
        this.hasFlyingSkills = false;
}

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public boolean isHasSwimmingSkills() {
        return hasSwimmingSkills;
    }

    public void setHasSwimmingSkills(boolean hasSwimmingSkills) {
        this.hasSwimmingSkills = hasSwimmingSkills;
    }

    public boolean isHasFlyingSkills() {
        return hasFlyingSkills;
    }

    public void setHasFlyingSkills(boolean hasFlyingSkills) {
        this.hasFlyingSkills = hasFlyingSkills;
    }
    public void runs(){
        System.out.println("It is runnin' right now !!");

    }
public void eats(){
    System.out.println("it is feeding . ");
}
public void sleeps(){
    System.out.println("it is sleeping now!!!");

}
final public void  animalMethod(){
    System.out.println("this is the final method from animal ");

}
}
