package chapters.Chapter11.Listings11;
import java.util.ArrayList;
public class TestArrayList {
    public static void main(String[] args) {
        //Create a list to store cities
        ArrayList<String> cityList = new ArrayList<>();

        //Add some cities in the list
        cityList.add("london");
        //city list now contains [london]
        cityList.add("izmir");
        // now contains izmir too
        cityList.add("balıkesir");
        //now balıkesir too
        cityList.add("gent");


        System.out.println("list size? " + cityList.size());
        System.out.println("is izmir in the city list : " + cityList.contains("izmir"));
        System.out.println("is the list is empty : " + cityList.isEmpty());
        
        //insert new city at index 2 
        cityList.add(2,"Xian" );
        //remove a city from the list 
        cityList.remove(1);
        
        //display the contents in the list in reverse order 

        for (int i =  cityList.size() - 1 ;i >=0 ;i--) {
            System.out.print(cityList.get(i) + " ");
            System.out.println();
        }
        // create a list to store two circle
        ArrayList<CircleFromSimpleGeometricObject> list = new ArrayList<>();
        // Add two circles
        list.add(new CircleFromSimpleGeometricObject(2));
        list.add(new CircleFromSimpleGeometricObject(3));

        //Display the area of the first circle in the
        System.out.println("The area of the cirle ? " + list.get(0).getArea());
        
    }
}
