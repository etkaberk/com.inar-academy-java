package weeks.week_14;

public class Lion {

    private int tailSize;
    private double weight;
    private double height;
    private boolean hasSwimmingSkills;
    private boolean hasFlyingSkills;


    public Lion() {

    }

    public Lion(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public int getTailSize() {
        return tailSize;
    }

    public void setTailSize(int tailSize) {
        this.tailSize = tailSize;
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

    public void runs() {
        System.out.println("Lion is runnin' right now !!");

    }



    public void eats() {
        System.out.println("Lion is feeding . ");
    }

    public void sleeps() {
        System.out.println("Lion is sleeping now!!!");
    }
}