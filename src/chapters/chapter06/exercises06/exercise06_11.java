package chapters.chapter06.exercises06;

public class exercise06_11 {
    public static void main(String[] args) {
        System.out.printf("%-15s %13s\n", "Sales amount", "Commission");
        System.out.println("----------------------------------");
        for (int i = 10000; i <= 100000; i += 500) {
            System.out.printf("%-15d %10.1f\n" ,i, computeCommission(i));
        }
    }
    public static double computeCommission(double salesAmount){
        double commission;
        if(salesAmount <= 5000){
            commission = salesAmount * 0.08;
        }else if (salesAmount <= 10000){
            salesAmount -= 5000;
            commission = (5000 * 0.08) + (salesAmount * 10);
        }else {
            commission = (5000 * 0.08);
            salesAmount -= 5000;
            commission += (5000 * 0.08);
            salesAmount-= 5000;
            commission += salesAmount * 12;
        }
        return commission;
    }
}
