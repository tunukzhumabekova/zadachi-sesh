import java.time.LocalDate;

public class Student {

    String name;
    LocalDate DateOfBirth;
    long phoneNumber;
    String Nationality;
public Student(){

}

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", DateOfBirth=" + DateOfBirth +
                ", phoneNumber=" + phoneNumber +
                ", Nationality='" + Nationality + '\'' +
                '}';
    }

    public Student(String name, LocalDate dateOfBirth, long phoneNumber, String nationality) {
        this.name = name;
        DateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        Nationality = nationality;

    }

    }


