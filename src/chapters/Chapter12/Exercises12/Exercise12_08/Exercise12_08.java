package chapters.Chapter12.Exercises12.Exercise12_08;


import java.util.Scanner;

public class Exercise12_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

            try {
                System.out.print("Enter an hex value :   ");
                String hexString = input.nextLine();
                check(hexString);
                System.out.println("Hex value is :   " + hexString);
            } catch (HexFormatException ex) {
                System.out.println(ex.getMessage());
            }
        }

    public static void check(String s)throws HexFormatException {
        for (int i = 0; i < s.length(); i++) {
            if (!isLegalHexValue(s.charAt(i))) {
                throw new HexFormatException(s);
            }
        }
    }

    public static boolean isLegalHexValue(char ch) {
        return ('A' <= ch && ch <= 'F') || ('0' <= ch && ch <= '9');
    }
}