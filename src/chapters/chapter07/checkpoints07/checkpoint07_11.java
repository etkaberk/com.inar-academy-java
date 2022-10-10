package chapters.chapter07.checkpoints07;

public class checkpoint07_11 {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5, 6};

        for (int i = 1; i < list.length; i++) {
            list[i] = list[i - 1];
        }

        for (int j : list) {
            System.out.print(j + " ");
        }
    }
}