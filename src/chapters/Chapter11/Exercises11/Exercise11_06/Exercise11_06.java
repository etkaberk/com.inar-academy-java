package chapters.Chapter11.Exercises11.Exercise11_06;
// toStringleri override yapıcaz hashcode alıyoruz!
import chapters.Chapter10.Listings10.Loan;
import chapters.Chapter11.Listings11.CircleFromSimpleGeometricObject;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Exercise11_06 {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        Object cirle = new CircleFromSimpleGeometricObject(5);
        Object loan = new Loan(7,14,234000);
        Object date = new Date();
        list.add(cirle);
        list.add(loan);
        list.add(date);

        System.out.println(list);
    }
}
