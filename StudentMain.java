import javax.naming.Name;
import java.time.LocalDate;
import java.util.Arrays;

public class StudentMain {
    public static void main(String[] args) {

        Student student = new Student("Tunuk", LocalDate.of(2007, 7, 20), 99674185296L, "Kyrgyz");
        Student student1 = new Student("Alina", LocalDate.of(2002, 8, 15), 99674185296L, "Kyrgyz");
        Student student2 = new Student("Farida", LocalDate.of(2003, 7, 17), 99674185296L, "Kyrgyz");
        Student student3 = new Student("Zalkar", LocalDate.of(2007, 1, 4), 99674185296L, "Kyrgyz");
        Student student4 = new Student("Uulkelsin", LocalDate.of(2001, 7, 28), 99674185296L, "Kyrgyz");
        Student[] Students = {student, student1, student2, student3, student4};
        for (Object x : Students) {
            System.out.println(x);


        }
    }


    }



