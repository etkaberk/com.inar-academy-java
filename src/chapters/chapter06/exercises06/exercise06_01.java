package chapters.chapter06.exercises06;
public class exercise06_01 {

    public static void main(String[] args) {

        final int NUMBER_PER_LINE = 10;
        for (int i = 1; i <= 100; i++){
            if((i - 1) % 10 == 0)//10 numbers per one line
                System.out.println();
            System.out.printf("%-7d", getPentagonalNumber(i));
        }
    }
    public static int getPentagonalNumber(int n){
        int pentagonalNumber = n * (3 * n - 1) / 2;
        return pentagonalNumber;
    }
}


