package chapters.chapter09.exercises09;

public class RegularPolygonTest {
    public static void main(String[] args) {
        RegularPolygon pol1 = new RegularPolygon();
        RegularPolygon pol2 = new RegularPolygon(6,4);
        RegularPolygon pol3 = new RegularPolygon(10,4,5.6,7.8);
        RegularPolygon[] array = {pol1 ,pol2 ,pol3};

        for (int i = 0; i < array.length; i++) {
            System.out.println("RegularPolygon " + (i +1 ) + " 's perimeter is :  "+ array[i].getPerimeter() + " area is : " + array[i].getArea());

        }
    }
}
