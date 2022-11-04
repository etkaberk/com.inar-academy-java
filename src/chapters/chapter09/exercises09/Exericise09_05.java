package chapters.chapter09.exercises09;

import java.util.GregorianCalendar;
public class Exericise09_05 {
    public static void main(String[] args) {
        GregorianCalendar calendar = new GregorianCalendar();
        System.out.println(calendar.get(GregorianCalendar.YEAR) + " / " + calendar.get(GregorianCalendar.MONTH) + " / "+ calendar.get(GregorianCalendar.DAY_OF_MONTH));
        System.out.println();

        calendar.setTimeInMillis(1234567898765L);
        System.out.println(calendar.get(GregorianCalendar.YEAR) + " / " + calendar.get(GregorianCalendar.MONTH) + " / "+ calendar.get(GregorianCalendar.DAY_OF_MONTH) );
    }
}

