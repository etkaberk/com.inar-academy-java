package chapters.chapter07.exercises07;

import java.util.Scanner;

public class exercise07_32 {
    public static void main(String[] args) {
        int[] list = getListFromUser();
        int pivot = partition(list);

        displayList(list, pivot);

    }

    public static int[] getListFromUser() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter list: ");
        int n = input.nextInt();
        int[] list = new int[n];
        for (int i = 0; i < n; i++) {
            list[i] = input.nextInt();
        }
        return list;
    }

    private static int partition(int[] list) {
        int pivot = list[0];
        int low = 1;
        int high = list.length - 1;
        while (low <= high) {
            while (true) {
                if (pivot >= list[low]) {

                    shiftRight(low, list);
                    low++;
                } else {
                    break;
                }
            }
            while (true) {
                if (pivot > list[high]) {
                    int temp = list[low];
                    list[low] = list[high];
                    list[high] = temp;
                    high--;
                    break;
                }else{
                    high--;
                    break;
                }
            }
        }


        return pivot;
    }


    public static void shiftRight(int limit, int[] list) {
        int temp = list[limit];


        for (int i = limit - 1; i >= 0; i--) {
            list[i + 1] = list[i];
        }
        list[0] = temp;

    }

    private static void displayList(int[] list, int pivot) {
        System.out.println("The pivot is: " + pivot);
        System.out.print("After the partition, the list is: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }
}

