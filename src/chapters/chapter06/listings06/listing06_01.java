package chapters.chapter06.listings06;

public class listing06_01 {
    public static void main(String[] args){
        int i = 5;
        int j = 2;
        int k =max(i,j);
        System.out.println("The max of "+ i + " and " + j + " is " + k );
    }
    public static int max( int num1 , int num2){
        int result ;
        if(num1> num2)
            result = num1;
        else result = num2;
        return result;
    }

}
