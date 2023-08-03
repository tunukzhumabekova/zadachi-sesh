public class Main {
    public static void main(String[] args) {
        Group group1 = new Group("Group 1", 2018, "John Doe");
        Group group2 = new Group("Group 2", 2021, "Jane Smith");

        Group groups[] = {group1, group2};

        Company company = new Company("Peaksoft", "Kyrgyztan", "04-09-2015", "One person", groups );

        Person person = new Person("Mikl", "Jordan", 1890);
        Person person1 = new Person("Jon", "Bush", 1983);

        System.out.println(company);
        System.out.println(person);
        System.out.println(person1);
    }

}
