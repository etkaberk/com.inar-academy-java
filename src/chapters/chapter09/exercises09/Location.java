package chapters.chapter09.exercises09;
//exercise09_13
public class Location {
    private int row;
    private int column;
    private double maxValue;
public Location(){
    this(0,0,Double.MAX_VALUE);
}
    public Location(int row , int column,double maxValue){
        this.row = row;
        this.column = column;
        this.maxValue = maxValue;
    }
public int getRow(){
        return row;
}
public int getColumn(){
        return column;
}
public double getMaxValue(){
        return maxValue;
    }
    public String toString(){
        return "Max value in row  : " + getRow() + " column : " + getColumn() + " max value : " + getMaxValue();
    }
}