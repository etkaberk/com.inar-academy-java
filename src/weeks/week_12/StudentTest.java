package weeks.week_12;

public class StudentTest {
    public static void main(String[] args) {
        Student etka = new Student("Etka ","Orman", 4120, "etkaberk@inar.com");
        etka.print();
        etka.setEmail("etkaberk96@gmail.com");
        etka.print();


        Student furkan = new Student();
        furkan.print();

        furkan.setSoyIsim("Sener");
        furkan.setId(4143);
        furkan.print();
        furkan.setIsim("Furkan");

    }
}
