package chapters.chapter05.exercises05;

public class Chapter05_39 {
    public static void main(String[] args){
        double commision = 0;
        double sales = 30000;
        double salary = 5000;

        while (commision + salary <= 30_000) {
            commision = 0;
            commision += 5000 * 0.08;
            commision += 5000 * 0.10;
            commision += (sales - 10000) * 0.12;
            sales += 0.01;
        }
        System.out.println("You'll need to make " + sales + "  in sales");
    }
}
