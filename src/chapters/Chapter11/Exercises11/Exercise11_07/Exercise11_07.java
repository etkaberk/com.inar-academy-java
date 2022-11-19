package chapters.Chapter11.Exercises11.Exercise11_07;

import java.util.ArrayList;

public class Exercise11_07 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 21; i++) {
            list.add(i);
        }
        display(list);
        shuffle(list);
        display(list);
    }

    public static void display(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");

        }
    }

    public static void shuffle(ArrayList<Integer> list) {
        java.util.Collections.shuffle(list);

    }
}
