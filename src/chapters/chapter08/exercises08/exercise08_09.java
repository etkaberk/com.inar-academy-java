package chapters.chapter08.exercises08;

import java.util.Scanner;

public class exercise08_09 {
    public static void main(String[] args) {

        char[][] table = new char[3][3];
        fill(table, ' ');
        int whoseTurn = 0;

        while (isOver(table)) {
            displayTable(table);
            promptThePLayerTicOrToe(table, whoseTurn);
            whoseTurn++;
        }

        displayTable(table);
        System.out.println((whoseTurn - 1 % 2 == 0) ? "X" : "Y" + " player won");
    }

    public static void fill(char[][] table, char ch) {
        for (int row = 0; row < table.length; row++) {
            for (int col = 0; col < table[row].length; col++) {
                table[row][col] = ch;
            }
        }
    }

    public static boolean isOver(char[][] table) {


        for (int i = 0; i < table.length; i++) {
            if (table[i][0] != ' ' && table[i][0] == table[i][1] && table[i][0] == table[i][2]) {
                return false;
            }
            if (table[i][0] != ' ' && (table[0][i] == table[1][i] && table[0][i] == table[2][i])) {
                return false;
            }
        }


        if (table[0][0] != ' ' && (table[0][0] == table[1][1] && table[0][0] == table[2][2])) {
            return false;
        }

        if (table[0][2] != ' ' && (table[0][2] == table[1][1] && table[0][2] == table[2][0])) {
            return false;
        }


        return true;
    }

    public static void displayTable(char[][] table) {
        for (int row = 0; row < table.length; row++) {
            System.out.println("-------------");
            for (int col = 0; col < table[row].length; col++) {
                System.out.print("| " + table[row][col] + " ");
            }
            System.out.println("|");
        }
        System.out.println("-------------");
    }

    private static void promptThePLayerTicOrToe(char[][] table, int whoseTurn) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a row (0, 1, 2) for player ");
            System.out.print((whoseTurn % 2 == 0) ? "X:" : "Y:");
            int row = input.nextInt();

            System.out.print("Enter a col (0, 1, 2) for player ");
            System.out.print((whoseTurn % 2 == 0) ? "X:" : "Y:");
            int col = input.nextInt();


            if (0 > col || col > 2 || 0 > row || row > 2) {
                System.out.println("Please to another place!");
                continue;
            }


            if (table[row][col] == ' ') {
                table[row][col] = ((whoseTurn % 2 == 0) ? 'X' : 'Y');
                break;
            }

            System.out.println("Please to another place!");
        }
    }
}
