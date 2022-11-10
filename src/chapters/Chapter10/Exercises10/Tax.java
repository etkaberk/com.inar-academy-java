package chapters.Chapter10.Exercises10;

public class Tax {
    public static final int SINGLE_FILER = 0;
    public static final int MARRIED_JOINTLY_OR_QUALIFIYING_WIDOW_OR_WIDOWER = 1;
    public static final int MARRIED_SEPARATELY = 2;
    public static final int HEAD_OF_HAUSEHOLD = 3;
    int fillingStatus;
    int[][] brackets;
    double[] rates;
    double taxableIncome;
}
