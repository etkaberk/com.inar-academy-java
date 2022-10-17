package chapters.chapter07.exercises07;

import sun.applet.Main;

import java.util.Scanner;

public class exercise07_26 {
    public static void main(String[] args) {
        int[] list1 = getFromUser();
        int[] list2 = getFromUser();
        if (isStrictlyIdentically(list1, list2)) {
            System.out.println("Two list are strictly identical");

        } else {
            System.out.println("Two list are not strictly identical");
        }
    }

    public static boolean isStrictlyIdentically(int[] list1, int[] list2) {
        if (list1.length != list2.length) {
            return false;
        }
        for (int i = 0; i < list1.length; i++) {
            if (list1[i] != list2[i]) {
                return false;
            }
        }
        return true;
    }

    public static int[] getFromUser() {
        Scanner input = new Scanner(System.in);
        System.out.print("enter a list :");
        int n = input.nextInt();
        int[] list = new int[n];
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }
        return list;
    }
}

