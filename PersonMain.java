public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person("Aidana", 20, "teacher", 400000, "Samsung", 20000);
        Person person1 = new Person("Asan", 20, "driver", 20000, "Samsung", 10000);
        Person person2 = new Person("Aijamal", 20, "doctor", 500000, "Redmi", 20000);
        Person person3 = new Person("Nurai", 20, "accounted", 400000, "iphone", 40000);
        Person person4 = new Person("Aliya", 20, "teacher", 400000, "Samsung", 20000);
        Person[] persons = {person, person1, person2, person3, person4};
        for (Person x : persons) {
            System.out.println(x);
        }
        System.out.println("Person with low salary");
        System.out.println(MaxSalary(persons));

        System.out.println("Person with high salary");
        System.out.println(MinSalary(persons));

        System.out.println("Person with expensive phone");
        System.out.println(ExpPhone(persons));
    }

    public static Person MaxSalary(Person[] persons) {
        Person person = persons[0];
        for (int i = 0; i < persons.length; i++) {
            if (persons[i].salary < person.salary) {
                person = persons[i];

            }
        }
        return person;
    }

    public static Person MinSalary(Person[] persons) {
        Person person = persons[0];
        for (int i = 0; i < persons.length; i++) {
            if (persons[i].salary > person.salary) {
                person = persons[i];

            }
        }
        return person;


    }

    public static Person ExpPhone(Person[] persons) {
        Person person = persons[0];
        for (int i = 0; i < persons.length; i++) {
            if (persons[i].priceOfPhone > person.priceOfPhone) {
                person = persons[i];

            }
        }
        return person;
    }
}