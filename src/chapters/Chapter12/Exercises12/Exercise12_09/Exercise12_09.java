package chapters.Chapter12.Exercises12.Exercise12_09;

import java.util.Scanner;

public class Exercise12_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try{
            System.out.print("Enter a binary value : ");
            String binaryValue = input.nextLine();
            System.out.println("Binary value " + binaryValue + " Decimal value : " + binaryToDecimal(binaryValue));
        }catch(BinaryFormatException ex){
            System.out.println(ex.getMessage());
        }
    }
public static int binaryToDecimal(String binaryValue) throws BinaryFormatException{
        int result = 0;
        int pow = binaryValue.length() -1 ;
    for (int i = 0; i < binaryValue.length(); i++) {
        if(!isBinary(binaryValue.charAt(i))){
            throw new BinaryFormatException(binaryValue);
        }
        result += Math.pow(2,pow--)* Integer.parseInt(binaryValue.charAt(i) + "");
    }
return result;

    }


    public static boolean isBinary(char ch) {
        if(ch == '0' || ch =='1'){
            return true;
        }
        return false;
    }

}
