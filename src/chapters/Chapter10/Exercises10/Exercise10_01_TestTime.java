package chapters.Chapter10.Exercises10;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

public class Exercise10_01_TestTime {
    public static void main(String[] args) {
        Time time1 = new Time();
        Time time2 = new Time(555550000);
        displayTime(time1);
        displayTime(time2);

    }
public static void displayTime(Time time){
    System.out.println(time.getHour() + ":" + time.getMinute() + ":" + time.getSecond());
}

}
