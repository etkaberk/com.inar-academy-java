package chapters.chapter07.listings07;

import static java.util.Arrays.binarySearch;

public class listing07_07 {
    public static void main(String[] args) {
        int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
        int i = binarySearch(list, 2);
        int j = binarySearch(list, 11);
        int k = binarySearch(list, 12);
        int l = binarySearch(list, 1);
        int m = binarySearch(list, 3);

        System.out.println("2 index is: " + i);
        System.out.println("11 index is: " + j);
        System.out.println("12 index is: " + k);
        System.out.println("1 index is: " + l);
        System.out.println("3 index is: " + m);

    }
}
