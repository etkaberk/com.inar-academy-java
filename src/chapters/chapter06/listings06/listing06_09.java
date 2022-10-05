package chapters.chapter06.listings06;

public class listing06_09 {
    public static void main(String[] args){
        System.out.println("The maximum of 3 an 4 is " + max(3,4));
        System.out.println("The maximum of 3.0 and 5.4 is " + max(3.0,5.4));
        System.out.println("The maximum of 3.0 ,5.4,and 10.14 is " + max(3.0,5.4,10.14));
    }
    public static int max(int num1 , int num2){
      if (num1 > num2)
          return num1;
      else
          return num2;
}
    public static double max(double num1,double num2){
        if(num1 > num2)
            return num1;
        else
            return num2;
    }
    public static double max(double num1,double num2, double num3){
        return max(max(num1,num2) , num3);
}

}
