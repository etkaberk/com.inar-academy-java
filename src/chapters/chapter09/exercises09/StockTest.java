package chapters.chapter09.exercises09;

public class StockTest {
    public static void main(String[] args) {
         Stock s = new Stock("ORCL","OracleCoorporation");
         s.previousClosingPrice = 34.5;
         s.currentPrice = 34.35;

        System.out.println("The price - change percentage is : % " + s.getChangePercent());
    }
}
