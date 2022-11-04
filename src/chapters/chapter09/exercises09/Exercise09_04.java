package chapters.chapter09.exercises09;

import java.util.Random;

public class Exercise09_04 {
    public static void main(String[] args) {
        Random rNum = new Random(1000);
        for(int i = 0; i < 50;i++ ){
            System.out.println("   " + rNum.nextInt(100));

            if ((i + 1) % 10 == 0 ){
                System.out.println();
            }
        }
    }
}
