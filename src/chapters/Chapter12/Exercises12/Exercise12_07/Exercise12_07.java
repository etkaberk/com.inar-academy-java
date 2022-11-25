package chapters.Chapter12.Exercises12.Exercise12_07;

import java.util.Scanner;

public class Exercise12_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a binary number: ");
            String bin = input.nextLine();

            try {
                System.out.println("The decimal value for binary number " + bin + " is " + bin2Dec(bin.toUpperCase()));
            } catch (NumberFormatException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
    public static int bin2Dec(String bin) throws NumberFormatException {
        int decimalValue = 0;

        for (int i = 0; i < bin.length(); i++) {
            char c = bin.charAt(i);
            if (!(c == '0' || c == '1')) {
                throw new NumberFormatException("It is not a binary string");
            }
            char binChar = bin.charAt(i);
            decimalValue = decimalValue * 2 + binCharToDecimal(binChar);
        }

        return decimalValue;
    }

    public static int binCharToDecimal(char ch) {
        return ch - '0';
    }
}