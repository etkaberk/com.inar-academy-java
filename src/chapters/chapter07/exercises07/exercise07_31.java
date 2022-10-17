package chapters.chapter07.exercises07;

import java.util.Scanner;

public class exercise07_31 {
    public static void main(String[] args) {

        int[] list1 = getListFromUser();
        int[] list2 = getListFromUser();

        int[] mergedList = merge(list1, list2);
        displayArray(mergedList);

    }

    public static void displayArray(int[] mergedList) {
        System.out.print("The merged list is ");
        for (int i = 0; i < mergedList.length; i++) {
            System.out.print(mergedList[i] + " ");
        }
    }

    public static int[] merge(int[] list1, int[] list2) {
        int[] mergedList = new int[list1.length + list2.length];

        sort(list1);
        sort(list2);

        int indexInList1 = 0;
        int indexInList2 = 0;
        int indexInMergedList = 0;


        while (indexInList1 != list1.length && indexInList2 != list2.length) {

            if (list1[indexInList1] > list2[indexInList2]) {
                mergedList[indexInMergedList] = list2[indexInList2];
                indexInMergedList++;
                indexInList2++;
            } else {
                mergedList[indexInMergedList] = list1[indexInList1];
                indexInMergedList++;
                indexInList1++;
            }
        }


        if (indexInList2 == list2.length) {
            for (int i = indexInList1; i < list1.length; i++) {
                mergedList[indexInMergedList] = list1[i];
                indexInMergedList++;
            }
        }


        if (indexInList1 == list1.length) {
            for (int i = indexInList2; i < list2.length; i++) {
                mergedList[indexInMergedList] = list2[i];
                indexInMergedList++;
            }
        }

        return mergedList;
    }


    public static void sort(int[] list) {
        int currentMin;
        int currentMinIndex;

        for (int i = 0; i < list.length - 1; i++) {
            currentMin = list[i];
            currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMinIndex = j;
                    currentMin = list[j];
                }
            }

            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }

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
}