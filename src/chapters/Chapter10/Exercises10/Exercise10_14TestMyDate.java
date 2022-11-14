package chapters.Chapter10.Exercises10;

public class Exercise10_14TestMyDate {
    public static void main(String[] args) {
        MyDate date1 = new MyDate();
        MyDate date2 = new MyDate(34355555133101L);

        System.out.println( "date1 :  " + date1.getMonth() + " / " + date1.getDay() + " / " + date1.getYear()) ;
        System.out.println("date2 :  " + date2.getMonth() + " / " + date2.getDay() + " / " + date2.getYear());
    }


}
