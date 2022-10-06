package chapters.chapter06.exercises06;

public class exercise06_16 {
    public static void main (String[] args){
        for (int i = 2000 ; i <=2020 ; i++)
            System.out.println( i + " has " + numberOfDaysInYear(i) + " days");
    }
public static int numberOfDaysInYear (int year){
        return  ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) ? 366 : 365;
}
}
