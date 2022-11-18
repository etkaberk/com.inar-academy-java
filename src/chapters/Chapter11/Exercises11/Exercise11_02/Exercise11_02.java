package chapters.Chapter11.Exercises11.Exercise11_02;
import chapters.Chapter10.Exercises10.MyDate;

import java.util.Date;

public class Exercise11_02 {
    public static void main(String[] args) {
        Person person = new Person("berk ","izmir karşıyaka" ,"123456","brk@sdgnk");
        Student student = new Student("yagmur" ,"yozgat" ,"8974327895","ythfgyr@hfyrv",Student.SENIOR);
        Employee employee = new Employee("sedat","iran","7586960","google@dujf","hilton",60000,new MyDate());
        Faculty faculty = new Faculty("benfero","goztepe","4579864" ,"ıurty@sdğoıhgj","hilton",50934,new MyDate(),"9","6.5");
        Staff staff = new Staff("meho", "mardin","4958946*79","odass@dkcx","pieerrloti",4567,new MyDate(),"gumruk");

        System.out.println(person);
        System.out.println(student);
        System.out.println(employee);
        System.out.println(faculty);
        System.out.println(staff);



    }
}
