package chapters.Chapter12.Exercises12.Exercise12_05;

public class Test {
    public static void main(String[] args) {
        try{
            Triangle triangle = new Triangle(2,2,6);
        }catch (IllegalTriangleException ex){
            System.out.println("you can not honey!!");
        }try{
            Triangle triangle1 = new Triangle(2,3,4);
            System.out.println(triangle1.toString());
        }catch(IllegalTriangleException ex){
            System.out.println("unfortunately u can not!!");
        }
    }
}
