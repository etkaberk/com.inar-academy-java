package chapters.Chapter11.Exercises11.Exercise11_02;
import chapters.Chapter10.Exercises10.MyDate;
public class Staff extends Employee {
    private String title;

    public Staff(String name, String address, String phoneNumber,String email , String office,double salary, MyDate hiredDate,String title){
        super(name,address,phoneNumber,email,office,salary,hiredDate);
        this.title = title;
    }
public String getTitle(){
        return title;
}
@Override
    public String toString(){
        return "Class = Staff\nName = " + getName() + "\n";
}
}
