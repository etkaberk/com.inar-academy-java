package chapters.Chapter13.Exercises13.exercise13_02;
import java.util.ArrayList;
import java.util.Collections;
public class exercise13_02 {
    public static void main(String[] args) {
        ArrayList<Number> list = getNumbers();
        System.out.println(list);
        shuffle(list);
        System.out.println(list.toString());
    }
    public static void shuffle(ArrayList<Number> list){
        Collections.shuffle(list);
    }
    public static ArrayList<Number> getNumbers(){
        ArrayList<Number> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add(i);

        }
    return list;
    }


}
