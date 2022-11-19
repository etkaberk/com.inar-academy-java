package chapters.Chapter11.Exercises11.Exercise11_05;

public class Exercise11_05 {
    public static void main(String[] args) {
        Course course = new Course("java development");
        System.out.println(course.getCourseName());
        System.out.println(course.getNumberOfStudents());
        course.addStudent("yağmur");
        course.addStudent("abdullah");
        System.out.println(course.toString());
        course.dropStudent("zeki");
        course.dropStudent("yağmur");
        System.out.println(course.getNumberOfStudents());
        System.out.println(course.toString());

            }
}
