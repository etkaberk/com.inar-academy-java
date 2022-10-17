package chapters.chapter07.exercises07;

import static chapters.chapter07.exercises07.exercise07_26.getFromUser;

public class exercise07_27 {
    public static void main(String[] args) {
        int[] list1 = getFromUser();
        int[] list2 = getFromUser();

        if(isTheTwoListIdentical(list1, list2)){
            System.out.println("Two lists are identical.");
        }
        else {
            System.out.println("Two lists are not identical.");
        }

    }

    public static boolean isTheTwoListIdentical(int[] list1, int[] list2) {
        if (list1.length != list2.length){
            return false;
        }

        int countTheNumber ;

        for (int i = 0; i < list1.length; i++) {
            countTheNumber = 0;
            for (int j = 0; j < list1.length; j++) {
                if(list1[i] == list1[j])
                    countTheNumber++;
            }
            for (int j = 0; j < list2.length; j++) {
                if (list1[i] == list2[j]){
                    countTheNumber--;
                }
            }

            if (countTheNumber != 0){
                return false;
            }
        }
        return true;
    }
}

