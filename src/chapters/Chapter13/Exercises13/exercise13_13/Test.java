package chapters.Chapter13.Exercises13.exercise13_13;

public class Test {
    public static void main(String[] args) {


        Course course = new Course("Painting");
        course.addStudent("Abdulrezzak");
        Course courseCloned = (Course) course.clone();
        System.out.println("are they equal ?? = " + (course == courseCloned));
    }
}