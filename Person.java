public class Person {

        String firstName;
        String lastName;
        String date;

        public Person(String firstName, String lastName, int date) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.date = String.valueOf(date);
        }
        public String getFirstName(){
            return getFirstName();
        }
        public String getLastName(){
            return getLastName();
        }

        @Override
        public String toString() {
            return "\n*|Person|*\n" +
                    "Имя: " + firstName + "\n" +
                    "Фамилия: " + lastName + "\n" +
                    "Дата рождения: " + date;
        }

        public String getDate(){
            return getDate();

        }
    }

