package chapters.chapter07.exercises07;

import java.util.Scanner;

public class exercise07_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of balls drop: ");
        int numberOfBalls = input.nextInt();

        System.out.print("Enter the number of slots in the bean machine: ");
        int numberOfSlot = input.nextInt();

        int[] slots = createArray(numberOfSlot);
        dropBalls(slots, numberOfBalls);
        printBuildupOfBalls(slots, numberOfBalls);
    }

    public static void printSlotsHistogram(String way) {
        System.out.println(way);
    }

    public static void dropBalls(int[] slots, int numberOfBalls) {
        int leftOrRight;
        String way;

        for (int i = 0; i < numberOfBalls; i++) {
            way = "";
            for (int j = 0; j < slots.length - 1; j++) {
                leftOrRight = (int) (Math.random() * 2);

                if (leftOrRight % 2 == 0)
                    way += 'R';
                else
                    way += 'L';
            }
            printSlotsHistogram(way);
            whereTheBallFall(slots, way);
        }
    }

    public static void whereTheBallFall(int[] slots, String s) {
        int countR = 0;
        char[] way = s.toCharArray();

        for (int i = 0; i < way.length; i++) {
            if (way[i] == 'R')
                countR++;
        }
        slots[countR]++;
    }

    public static void printBuildupOfBalls(int[] slots, int numberOfBalls) {
        int maxBallInASlot = findTheGreatestBallNumberInASlot(slots);
        int displayedBalls = 0;


        while (displayedBalls < numberOfBalls) {
            for (int j = 0; j < slots.length; j++) {
                if (slots[j] == maxBallInASlot) {
                    System.out.print("0");
                    slots[j]--;
                    numberOfBalls--;
                    displayedBalls++;
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            maxBallInASlot--;
        }
    }

    private static int findTheGreatestBallNumberInASlot(int[] slots) {
        int maxBalls = 0;
        for (int i = 0; i < slots.length; i++) {
            maxBalls = (slots[i] > maxBalls) ? slots[i] : maxBalls;
        }
        return maxBalls;
    }

    public static int[] createArray(int numberOfSlot) {
        return new int[numberOfSlot];
    }
}