package chapters.Chapter11.Exercises11.Exercise11_05;
import com.sun.org.apache.regexp.internal.RE;

import java.util.ArrayList;
import java.util.Arrays;
public class Course {
    private String courseName;
    private ArrayList<String> students = new ArrayList<>();
    public Course(String courseName){
        this.courseName = courseName;
    }
public void addStudent(String student){
        students.add(student);
}
public int getNumberOfStudents(){
        return students.size();
}
public String getCourseName(){
    return courseName;
}
public void dropStudent(String name){
        if(!students.remove(name)){
            System.out.println(name + " is not in the course");
        }
}
@Override
public String toString(){
        return students.toString();
}
}
