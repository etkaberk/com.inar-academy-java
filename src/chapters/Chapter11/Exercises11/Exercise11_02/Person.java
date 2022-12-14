package chapters.Chapter11.Exercises11.Exercise11_02;

public class Person {
    private String name;
    private String address;
    private String phoneNumber;
    private String email;


    public Person() {
    }

    public Person(String name, String address, String phoneNumber, String email) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email = email;

    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Class = Person\nName = " + name + "\n";
    }
}