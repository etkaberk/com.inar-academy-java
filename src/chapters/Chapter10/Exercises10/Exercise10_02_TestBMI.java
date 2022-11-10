package chapters.Chapter10.Exercises10;

public class Exercise10_02_TestBMI {
    public static void main(String[] args) {


        BMI vki = new BMI("etka", 26, 150, 80);
        System.out.println("BMI for " + vki.getName() + " is " + vki.getBmi() + " --> " + vki.getStatus());
    }

}
