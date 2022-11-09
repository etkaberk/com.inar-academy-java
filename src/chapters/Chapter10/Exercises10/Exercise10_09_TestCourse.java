package chapters.Chapter10.Exercises10;

public class Exercise10_09_TestCourse {
    public static void main(String[] args) {
        Course c1 = new Course("Rehersal");
        c1.addStudent("berk");
        c1.addStudent("serhat");
        c1.addStudent("furkan");
        c1.displayStudents();
        System.out.println("---------------------");
        c1.dropStudent("berk");
        c1.displayStudents();
        System.out.println("---------------------");
        c1.clear();
        c1.displayStudents();
    }
}
