package chapters.chapter06.exercises06;

public class exercise06_14 {
    public static void main(String[] args){
        System.out.printf("%-10s %3s-\n","i","m(i)");
        System.out.println("-----------------");
        for (int i = 1; i <= 901 ; i++){
            System.out.printf("%-10d%-1.4f\n" , i , estimateP(i));
        }
    }
    public static double estimateP(int n){
        double sum = 0;
        for (int i = 1 ; i <= n ; i++){
            sum += (Math.pow(-1,i+1) / (2 * i - 1));
        }
    return 4*sum;
    }
}

